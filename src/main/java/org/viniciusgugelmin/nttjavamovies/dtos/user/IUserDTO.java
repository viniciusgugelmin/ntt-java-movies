package org.viniciusgugelmin.nttjavamovies.dtos.user;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.List;

public interface IUserDTO {
    /* Getters */

    String getName();

    /* Setters */

    void setName(String name);

    /* Relations Getters */

    List<MovieDTO> getFavoriteMovies();

    /* Relations Setters */

    void setFavoriteMovies(List<MovieDTO> movies);
}
