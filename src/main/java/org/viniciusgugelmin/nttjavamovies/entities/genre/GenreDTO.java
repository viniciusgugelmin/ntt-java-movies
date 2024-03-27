package org.viniciusgugelmin.nttjavamovies.entities.genre;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

public interface GenreDTO {
    /* Getters */

    Long getId();

    String getName();

    /* Setters */

    void setId(Long id);

    void setName(String name);

    /* Relations Getters */

    List<Movie> getMovies();

    /* Relations Setters */

    void setMovies(List<Movie> movies);
}
