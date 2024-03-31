package org.viniciusgugelmin.nttjavamovies.services.movie;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.services.base.IBaseService;

import java.util.List;

public interface IMovieService extends IBaseService<Movie> {
    List<Movie> listMoviesBySearch(String search);
}
