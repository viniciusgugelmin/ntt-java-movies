package org.viniciusgugelmin.nttjavamovies.dtos.genre;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.List;

public interface IGenreDTO {
    /* Getters */

    String getName();

    /* Setters */

    void setName(String name);

    /* Relations Getters */

    List<MovieDTO> getMovies();

    /* Relations Setters */

    void setMovies(List<MovieDTO> movies);
}
