package org.viniciusgugelmin.nttjavamovies.entities.user;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

public interface IUser {
    /* Getters */

    Long getId();

    String getName();

    /* Setters */

    void setId(Long id);

    void setName(String name);

    /* Relations Getters */

    List<Movie> getFavoriteMovies();

    /* Relations Setters */

    void setFavoriteMovies(List<Movie> movies);
}
