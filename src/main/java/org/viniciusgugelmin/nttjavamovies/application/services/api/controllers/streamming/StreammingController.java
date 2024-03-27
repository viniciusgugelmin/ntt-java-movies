package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.streamming;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.IStreamming;

import java.util.List;

@RestController
@RequestMapping(value = "/streamming")
public class StreammingController implements IStreammingController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<IStreamming>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<IStreamming> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<IStreamming> save(@RequestBody IStreamming streamming) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<IStreamming> update(@RequestBody IStreamming streamming) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<IStreamming> delete(@PathVariable Long id) {
        return null;
    }
}
