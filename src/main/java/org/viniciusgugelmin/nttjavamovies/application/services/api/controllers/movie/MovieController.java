package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.movie;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.services.movie.IMovieService;

import java.util.List;
import java.util.Optional;

@Tag(name = "Movie")
@RestController
@RequestMapping(value = "/movie")
public class MovieController implements IMovieController {
    private final IMovieService movieService;

    @Autowired
    public MovieController(IMovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping(value = "")
    @Override
    public ResponseEntity<List<Movie>> findAll() {
        List<Movie> movies = this.movieService.list();

        return ResponseEntity.ok(movies);
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

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        this.movieService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
