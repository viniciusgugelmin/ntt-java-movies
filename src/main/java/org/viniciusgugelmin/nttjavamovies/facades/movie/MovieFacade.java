package org.viniciusgugelmin.nttjavamovies.facades.movie;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.withoutRelations.MovieWithoutRelationsDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.min.UserMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.services.franchise.IFranchiseService;
import org.viniciusgugelmin.nttjavamovies.services.movie.IMovieService;
import org.viniciusgugelmin.nttjavamovies.services.user.IUserService;

import java.util.List;
import java.util.Map;

@Service
public class MovieFacade implements IMovieFacade {

    private final IMovieService movieService;

    private final IUserService userService;

    private final IFranchiseService franchiseService;

    @Autowired
    public MovieFacade(IMovieService movieService, IUserService userService, IFranchiseService franchiseService) {
        this.movieService = movieService;
        this.userService = userService;
        this.franchiseService = franchiseService;
    }


    @Override
    public Map<String, List<MovieMinDTO>> listMoviesBySearch(String search) {
        List<Movie> movies = movieService.listMoviesBySearch(search);
        List<MovieMinDTO> movieMinDTOS = MovieMinDTO.convertList(movies);

        return Map.of("Search", movieMinDTOS);
    }

    @Transactional
    @Override
    public UserMinDTO controlFavorite(Long id, Long userId) {
        User user = userService.findById(userId).orElseThrow();
        Movie movie = movieService.findById(id).orElseThrow();

        List<User> favoritedBy = movie.getFavoritedBy();
        List<Movie> favoriteMovies = user.getFavoriteMovies();

        if (favoritedBy.contains(user)) {
            favoritedBy.remove(user);
            favoriteMovies.remove(movie);
        } else {
            favoritedBy.add(user);
            favoriteMovies.add(movie);
        }

        UserMinDTO updatedUser = new UserMinDTO(userService.update(user));
        updatedUser.setFavoriteMovies(MovieMinDTO.convertList(favoriteMovies));

        return updatedUser;
    }

    @Transactional
    @Override
    public MovieWithoutRelationsDTO changeFranchise(Long id, Long franchiseId) {
        Movie movie = movieService.findById(id).orElseThrow();
        Franchise franchise = franchiseService.findById(franchiseId).orElseThrow();

        movie.setFranchise(franchise);

        return new MovieWithoutRelationsDTO(movieService.update(movie));
    }
}
