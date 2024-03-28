package org.viniciusgugelmin.nttjavamovies.services.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.genre.IGenre;
import org.viniciusgugelmin.nttjavamovies.repositories.genre.GenreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService implements IGenreService {
    private final GenreRepository genreRepository;

    @Autowired
    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    @Override
    public List<IGenre> list() {
        return this.genreRepository.findAll();
    }

    @Override
    public Optional<IGenre> findById(Long id) {
        return this.genreRepository.findById(id);
    }

    @Override
    public IGenre create(IGenre object) {
        return this.genreRepository.save(object);
    }

    @Override
    public IGenre update(IGenre object) {
        return this.genreRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.genreRepository.deleteById(id);
    }
}
