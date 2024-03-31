package org.viniciusgugelmin.nttjavamovies.facades.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.services.movie.IMovieService;

import java.util.List;
import java.util.Map;

@Service
public class MovieFacade implements IMovieFacade {

    private final IMovieService movieService;

    @Autowired
    public MovieFacade(IMovieService movieService) {
        this.movieService = movieService;
    }


    @Override
    public Map<String, List<MovieMinDTO>> listMoviesBySearch(String search) {
        List<Movie> movies = movieService.listMoviesBySearch(search);
        List<MovieMinDTO> movieMinDTOS = MovieMinDTO.convertList(movies);

        return Map.of("Search", movieMinDTOS);
    }
}
