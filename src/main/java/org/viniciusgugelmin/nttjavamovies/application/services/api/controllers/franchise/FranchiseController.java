package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.franchise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;
import org.viniciusgugelmin.nttjavamovies.services.franchise.IFranchiseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/franchise")
public class FranchiseController implements IFranchiseController {
    private final IFranchiseService franchiseService;

    @Autowired
    public FranchiseController(IFranchiseService franchiseService) {
        this.franchiseService = franchiseService;
    }

    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<Franchise>> findAll() {
        List<Franchise> franchises = this.franchiseService.list();

        return franchises != null ? ResponseEntity.ok(franchises) : ResponseEntity.notFound().build();
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<Optional<Franchise>> findById(@PathVariable Long id) {
        Optional<Franchise> franchise = this.franchiseService.findById(id);

        return franchise.isPresent() ? ResponseEntity.ok(franchise) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<Franchise> save(@RequestBody Franchise franchise) {
        Franchise newFranchise = this.franchiseService.create(franchise);

        return ResponseEntity.ok(newFranchise);
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<Franchise> update(@RequestBody Franchise franchise) {
        Franchise updatedFranchise = this.franchiseService.update(franchise);

        return ResponseEntity.ok(updatedFranchise);
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        this.franchiseService.delete(id);

        return ResponseEntity.noContent().build();
    }
}
