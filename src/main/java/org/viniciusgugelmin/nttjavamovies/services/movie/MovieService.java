package org.viniciusgugelmin.nttjavamovies.services.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.repositories.movie.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements IMovieService {
    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<Movie> list() {
        return this.movieRepository.findAll();
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return this.movieRepository.findById(id);
    }

    @Override
    public List<Movie> listMoviesBySearch(String search) {
        return this.movieRepository.getMoviesByTitle(search);
    }

    @Override
    public Movie create(Movie object) {
        return this.movieRepository.save(object);
    }

    @Override
    public Movie update(Movie object) {
        return this.movieRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        this.movieRepository.deleteById(id);
    }
}
