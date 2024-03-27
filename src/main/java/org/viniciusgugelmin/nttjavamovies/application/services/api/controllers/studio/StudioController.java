package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.studio;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.studio.IStudio;

import java.util.List;

@RestController
@RequestMapping(value = "/studio")
public class StudioController implements IStudioController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<IStudio>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<IStudio> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<IStudio> save(@RequestBody IStudio studio) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<IStudio> update(@RequestBody IStudio studio) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<IStudio> delete(@PathVariable Long id) {
        return null;
    }
}
