package org.viniciusgugelmin.nttjavamovies.facades.movie;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.withoutRelations.MovieWithoutRelationsDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.min.UserMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.actor.Actor;
import org.viniciusgugelmin.nttjavamovies.entities.director.Director;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.Streamming;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.services.actor.IActorService;
import org.viniciusgugelmin.nttjavamovies.services.director.IDirectorService;
import org.viniciusgugelmin.nttjavamovies.services.franchise.IFranchiseService;
import org.viniciusgugelmin.nttjavamovies.services.movie.IMovieService;
import org.viniciusgugelmin.nttjavamovies.services.streamming.IStreammingService;
import org.viniciusgugelmin.nttjavamovies.services.user.IUserService;

import java.util.List;
import java.util.Map;

@Service
public class MovieFacade implements IMovieFacade {

    private final IMovieService movieService;

    private final IUserService userService;

    private final IFranchiseService franchiseService;

    private final IStreammingService streammingService;

    private final IActorService actorService;

    private final IDirectorService directorService;

    @Autowired
    public MovieFacade(IMovieService movieService, IUserService userService, IFranchiseService franchiseService, IStreammingService streammingService, IActorService actorService, IDirectorService directorService) {
        this.movieService = movieService;
        this.userService = userService;
        this.franchiseService = franchiseService;
        this.streammingService = streammingService;
        this.actorService = actorService;
        this.directorService = directorService;
    }

    @Override
    public MovieWithoutRelationsDTO findById(Long id) {
        return new MovieWithoutRelationsDTO(movieService.findById(id).orElseThrow());
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

    @Transactional
    @Override
    public MovieWithoutRelationsDTO addStreamming(Long id, Long streammingId) {
        Movie movie = movieService.findById(id).orElseThrow();
        Streamming streamming = streammingService.findById(streammingId).orElseThrow();

        movie.getStreammings().add(streamming);

        return new MovieWithoutRelationsDTO(movieService.update(movie));
    }

    @Transactional
    @Override
    public MovieWithoutRelationsDTO removeStreamming(Long id, Long streammingId) {
        Movie movie = movieService.findById(id).orElseThrow();
        Streamming streamming = streammingService.findById(streammingId).orElseThrow();

        movie.getStreammings().remove(streamming);

        return new MovieWithoutRelationsDTO(movieService.update(movie));
    }

    @Transactional
    @Override
    public MovieWithoutRelationsDTO addActor(Long id, Long actorId) {
        Movie movie = movieService.findById(id).orElseThrow();
        Actor actor = actorService.findById(actorId).orElseThrow();

        movie.getActors().add(actor);

        return new MovieWithoutRelationsDTO(movieService.update(movie));
    }

    @Transactional
    @Override
    public MovieWithoutRelationsDTO removeActor(Long id, Long actorId) {
        Movie movie = movieService.findById(id).orElseThrow();
        Actor actor = actorService.findById(actorId).orElseThrow();

        movie.getActors().remove(actor);

        return new MovieWithoutRelationsDTO(movieService.update(movie));
    }

    @Transactional
    @Override
    public MovieWithoutRelationsDTO addDirector(Long id, Long directorId) {
        Movie movie = movieService.findById(id).orElseThrow();
        Director director = directorService.findById(directorId).orElseThrow();

        movie.getDirectors().add(director);

        return new MovieWithoutRelationsDTO(movieService.update(movie));
    }

    @Transactional
    @Override
    public MovieWithoutRelationsDTO removeDirector(Long id, Long directorId) {
        Movie movie = movieService.findById(id).orElseThrow();
        Director director = directorService.findById(directorId).orElseThrow();

        movie.getDirectors().remove(director);

        return new MovieWithoutRelationsDTO(movieService.update(movie));
    }
}
