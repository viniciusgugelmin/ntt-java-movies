package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.streamming;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.Streamming;
import org.viniciusgugelmin.nttjavamovies.services.streamming.IStreammingService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/streamming")
public class StreammingController implements IStreammingController {
    private final IStreammingService streammingService;

    @Autowired
    public StreammingController(IStreammingService streammingService) {
        this.streammingService = streammingService;
    }

    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<Streamming>> findAll() {
        List<Streamming> streammings = this.streammingService.list();

        return ResponseEntity.ok(streammings);
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<Optional<Streamming>> findById(@PathVariable Long id) {
        Optional<Streamming> streamming = this.streammingService.findById(id);

        return streamming.isPresent() ? ResponseEntity.ok(streamming) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<Streamming> save(@RequestBody Streamming streamming) {
        Streamming newStreamming = this.streammingService.create(streamming);

        return ResponseEntity.ok(newStreamming);
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<Streamming> update(@RequestBody Streamming streamming) {
        Streamming updatedStreamming = this.streammingService.update(streamming);

        return ResponseEntity.ok(updatedStreamming);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        this.streammingService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
