package org.viniciusgugelmin.nttjavamovies.services.director;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.director.Director;
import org.viniciusgugelmin.nttjavamovies.repositories.director.DirectorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class DirectorService implements IDirectorService {
    private final DirectorRepository directorRepository;

    @Autowired
    public DirectorService(DirectorRepository directorRepository) {
        this.directorRepository = directorRepository;
    }

    @Override
    public List<Director> list() {
        return this.directorRepository.findAll();
    }

    @Override
    public Optional<Director> findById(Long id) {
        return this.directorRepository.findById(id);
    }

    @Override
    public Director create(Director object) {
        return this.directorRepository.save(object);
    }

    @Override
    public Director update(Director object) {
        return this.directorRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.directorRepository.deleteById(id);
    }
}
