package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.genre;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.genre.IGenre;

import java.util.List;

@RestController
@RequestMapping(value = "/genre")
public class GenreController implements IGenreController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<IGenre>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<IGenre> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<IGenre> save(@RequestBody IGenre genre) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<IGenre> update(@RequestBody IGenre genre) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<IGenre> delete(@PathVariable Long id) {
        return null;
    }
}
