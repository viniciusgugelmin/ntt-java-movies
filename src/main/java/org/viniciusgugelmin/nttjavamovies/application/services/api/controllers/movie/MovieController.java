package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.movie.IMovie;

import java.util.List;

@RestController
@RequestMapping(value = "/movie")
public class MovieController implements IMovieController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<IMovie>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<IMovie> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<IMovie> save(@RequestBody IMovie movie) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<IMovie> update(@RequestBody IMovie movie) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<IMovie> delete(@PathVariable Long id) {
        return null;
    }
}
