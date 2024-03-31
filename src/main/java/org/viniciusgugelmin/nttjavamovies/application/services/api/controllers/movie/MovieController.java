package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.movie;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.withoutRelations.MovieWithoutRelationsDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.min.UserMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.facades.movie.IMovieFacade;
import org.viniciusgugelmin.nttjavamovies.services.movie.IMovieService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Tag(name = "Movie")
@RestController
@RequestMapping(value = "/movie")
public class MovieController implements IMovieController {
    private final IMovieService movieService;

    private final IMovieFacade movieFacade;

    @Autowired
    public MovieController(IMovieService movieService, IMovieFacade movieFacade) {
        this.movieService = movieService;
        this.movieFacade = movieFacade;
    }

    @GetMapping(value = "")
    @Override
    public ResponseEntity<List<Movie>> findAll() {
        List<Movie> movies = this.movieService.list();

        return ResponseEntity.ok(movies);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<Map<String, List<MovieMinDTO>>> searchByTerm(@RequestParam String s) {
        Map<String, List<MovieMinDTO>> response = this.movieFacade.listMoviesBySearch(s);

        return ResponseEntity.ok(response);
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<Optional<Movie>> findById(@PathVariable Long id) {
        Optional<Movie> movie = this.movieService.findById(id);

        return movie.isPresent() ? ResponseEntity.ok(movie) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "")
    @Override
    public ResponseEntity<Movie> save(@RequestBody Movie movie) {
        Movie newMovie = this.movieService.create(movie);

        return ResponseEntity.ok(newMovie);
    }

    @PutMapping(value = "")
    @Override
    public ResponseEntity<Movie> update(@RequestBody Movie movie) {
        Movie updatedMovie = this.movieService.update(movie);

        return ResponseEntity.ok(updatedMovie);
    }

    @PutMapping(value = "/{id}/user/{userId}")
    @Override
    public ResponseEntity<UserMinDTO> controlFavorite(@PathVariable Long id, @PathVariable Long userId) {
        UserMinDTO response = this.movieFacade.controlFavorite(id, userId);

        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/{id}/franchise/{franchiseId}")
    @Override
    public ResponseEntity<MovieWithoutRelationsDTO> changeFranchise(@PathVariable Long id, @PathVariable Long franchiseId) {
        MovieWithoutRelationsDTO response = this.movieFacade.changeFranchise(id, franchiseId);

        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        this.movieService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
