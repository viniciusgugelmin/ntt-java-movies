package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.franchise;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.IFranchise;

import java.util.List;

@RestController
@RequestMapping(value = "/franchise")
public class FranchiseController implements IFranchiseController {
    @GetMapping(value = "/")
    @Override
    public ResponseEntity<List<IFranchise>> findAll() {
        return null;
    }

    @GetMapping(value = "/{id}")
    @Override
    public ResponseEntity<IFranchise> findById(@PathVariable Long id) {
        return null;
    }

    @PostMapping(value = "/")
    @Override
    public ResponseEntity<IFranchise> save(@RequestBody IFranchise franchise) {
        return null;
    }

    @PutMapping(value = "/")
    @Override
    public ResponseEntity<IFranchise> update(@RequestBody IFranchise franchise) {
        return null;
    }

    @DeleteMapping(value = "/{id}")
    @Override
    public ResponseEntity<IFranchise> delete(@PathVariable Long id) {
        return null;
    }
}
