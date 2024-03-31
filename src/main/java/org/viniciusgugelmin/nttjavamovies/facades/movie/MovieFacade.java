package org.viniciusgugelmin.nttjavamovies.facades.movie;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.services.movie.IMovieService;
import org.viniciusgugelmin.nttjavamovies.services.user.IUserService;

import java.util.List;
import java.util.Map;

@Service
public class MovieFacade implements IMovieFacade {

    private final IMovieService movieService;

    private final IUserService userService;

    @Autowired
    public MovieFacade(IMovieService movieService, IUserService userService) {
        this.movieService = movieService;
        this.userService = userService;
    }


    @Override
    public Map<String, List<MovieMinDTO>> listMoviesBySearch(String search) {
        List<Movie> movies = movieService.listMoviesBySearch(search);
        List<MovieMinDTO> movieMinDTOS = MovieMinDTO.convertList(movies);

        return Map.of("Search", movieMinDTOS);
    }

    @Transactional
    @Override
    public User controlFavorite(Long id, Long userId) {
        User user = userService.findById(userId).orElseThrow();
        Movie movie = movieService.findById(id).orElseThrow();

        List<User> favoritedBy = movie.getFavoritedBy();

        if (favoritedBy.contains(user)) {
            favoritedBy.remove(user);
        } else {
            favoritedBy.add(user);
        }

        return userService.update(user);
    }
}
