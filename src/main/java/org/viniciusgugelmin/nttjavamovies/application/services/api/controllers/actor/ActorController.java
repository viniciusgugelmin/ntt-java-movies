package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.actor.Actor;
import org.viniciusgugelmin.nttjavamovies.services.actor.IActorService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/actor")
public class ActorController implements IActorController {
    private final IActorService actorService;

    @Autowired
    public ActorController(IActorService actorService) {
        this.actorService = actorService;
    }

    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<Actor>> findAll() {
        List<Actor> actors = this.actorService.list();

        return ResponseEntity.ok(actors);
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<Optional<Actor>> findById(@PathVariable Long id) {
        Optional<Actor> actor = this.actorService.findById(id);

        return actor.isPresent() ? ResponseEntity.ok(actor) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<Actor> save(@RequestBody Actor actor) {
        Actor newActor = this.actorService.create(actor);

        return ResponseEntity.ok(newActor);
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<Actor> update(@RequestBody Actor actor) {
        Actor updatedActor = this.actorService.update(actor);

        return ResponseEntity.ok(updatedActor);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        this.actorService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
