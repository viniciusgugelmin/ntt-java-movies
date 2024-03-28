package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.genre;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;
import org.viniciusgugelmin.nttjavamovies.services.genre.IGenreService;

import java.util.List;
import java.util.Optional;

@Tag(name = "Genre")
@RestController
@RequestMapping(value = "/genre")
public class GenreController implements IGenreController {
    private final IGenreService genreService;

    @Autowired
    public GenreController(IGenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping(value = "")
    @Override
    public ResponseEntity<List<Genre>> findAll() {
        List<Genre> genres = this.genreService.list();

        return ResponseEntity.ok(genres);
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<Optional<Genre>> findById(@PathVariable Long id) {
        Optional<Genre> genre = this.genreService.findById(id);

        return genre.isPresent() ? ResponseEntity.ok(genre) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "")
    @Override
    public ResponseEntity<Genre> save(@RequestBody Genre genre) {
        Genre newGenre = this.genreService.create(genre);

        return ResponseEntity.ok(newGenre);
    }

    @PutMapping(value = "")
    @Override
    public ResponseEntity<Genre> update(@RequestBody Genre genre) {
        Genre updatedGenre = this.genreService.update(genre);

        return ResponseEntity.ok(updatedGenre);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        this.genreService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
