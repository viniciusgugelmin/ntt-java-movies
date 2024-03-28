package org.viniciusgugelmin.nttjavamovies.services.genre;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;
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
    public List<Genre> list() {
        return this.genreRepository.findAll();
    }

    @Override
    public Optional<Genre> findById(Long id) {
        return this.genreRepository.findById(id);
    }

    @Override
    public Genre create(Genre object) {
        return this.genreRepository.save(object);
    }

    @Override
    public Genre update(Genre object) {
        return this.genreRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.genreRepository.deleteById(id);
    }
}
