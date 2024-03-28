package org.viniciusgugelmin.nttjavamovies.services.franchise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.IFranchise;
import org.viniciusgugelmin.nttjavamovies.repositories.franchise.FranchiseRepository;
import org.viniciusgugelmin.nttjavamovies.services.franchise.IFranchiseService;

import java.util.List;
import java.util.Optional;

@Service
public class FranchiseService implements IFranchiseService {
    private final FranchiseRepository franchiseRepository;

    @Autowired
    public FranchiseService(FranchiseRepository franchiseRepository) {
        this.franchiseRepository = franchiseRepository;
    }

    @Override
    public List<IFranchise> list() {
        return this.franchiseRepository.findAll();
    }

    @Override
    public Optional<IFranchise> findById(Long id) {
        return this.franchiseRepository.findById(id);
    }

    @Override
    public IFranchise create(IFranchise object) {
        return this.franchiseRepository.save(object);
    }

    @Override
    public IFranchise update(IFranchise object) {
        return this.franchiseRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.franchiseRepository.deleteById(id);
    }
}
