package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.studio;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.studio.Studio;
import org.viniciusgugelmin.nttjavamovies.services.studio.IStudioService;

import java.util.List;
import java.util.Optional;

@Tag(name = "Studio")
@RestController
@RequestMapping(value = "/studio")
public class StudioController implements IStudioController {
    private final IStudioService studioService;

    @Autowired
    public StudioController(IStudioService studioService) {
        this.studioService = studioService;
    }

    @GetMapping(value = "")
    @Override
    public ResponseEntity<List<Studio>> findAll() {
        List<Studio> studios = studioService.list();

        return ResponseEntity.ok(studios);
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<Optional<Studio>> findById(@PathVariable Long id) {
        Optional<Studio> studio = studioService.findById(id);

        return studio.isPresent() ? ResponseEntity.ok(studio) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "")
    @Override
    public ResponseEntity<Studio> save(@RequestBody Studio studio) {
        Studio newStudio = studioService.create(studio);

        return ResponseEntity.ok(newStudio);
    }

    @PutMapping(value = "")
    @Override
    public ResponseEntity<Studio> update(@RequestBody Studio studio) {
        Studio updatedStudio = studioService.update(studio);

        return ResponseEntity.ok(updatedStudio);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        studioService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
