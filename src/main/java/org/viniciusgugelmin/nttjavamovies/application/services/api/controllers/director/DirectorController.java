package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.director;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.director.Director;
import org.viniciusgugelmin.nttjavamovies.services.director.IDirectorService;

import java.util.List;
import java.util.Optional;

@Tag(name = "Director")
@RestController
@RequestMapping(value = "/director")
public class DirectorController implements IDirectorController {
    private final IDirectorService directorService;

    @Autowired
    public DirectorController(IDirectorService directorService) {
        this.directorService = directorService;
    }

    @GetMapping(value = "")
    @Override
    public ResponseEntity<List<Director>> findAll() {
        List<Director> directors = this.directorService.list();

        return ResponseEntity.ok(directors);
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<Optional<Director>> findById(@PathVariable Long id) {
        Optional<Director> director = this.directorService.findById(id);

        return director.isPresent() ? ResponseEntity.ok(director) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "")
    @Override
    public ResponseEntity<Director> save(@RequestBody Director director) {
        Director newDirector = this.directorService.create(director);

        return ResponseEntity.ok(newDirector);
    }

    @PutMapping(value = "")
    @Override
    public ResponseEntity<Director> update(@RequestBody Director director) {
        Director updatedDirector = this.directorService.update(director);

        return ResponseEntity.ok(updatedDirector);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        this.directorService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
