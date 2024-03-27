package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.director;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.director.IDirector;

import java.util.List;

@RestController
@RequestMapping(value = "/director")
public class DirectorController implements IDirectorController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<IDirector>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<IDirector> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<IDirector> save(@RequestBody IDirector director) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<IDirector> update(@RequestBody IDirector director) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<IDirector> delete(@PathVariable Long id) {
        return null;
    }
}
