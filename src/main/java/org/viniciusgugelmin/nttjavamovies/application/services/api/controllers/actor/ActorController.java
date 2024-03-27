package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.actor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.actor.IActor;

import java.util.List;

@RestController
@RequestMapping(value = "/actor")
public class ActorController implements  IActorController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<IActor>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<IActor> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<IActor> save(@RequestBody IActor actor) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<IActor> update(@RequestBody IActor actor) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<IActor> delete(@PathVariable Long id) {
        return null;
    }
}
