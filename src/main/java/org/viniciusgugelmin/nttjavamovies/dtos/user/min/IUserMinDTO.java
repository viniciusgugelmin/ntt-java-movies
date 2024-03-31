package org.viniciusgugelmin.nttjavamovies.dtos.user.min;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;

import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IUserMinDTO {
    /* Getters */

    String getName();

    /* Setters */

    void setName(String name);

    /* Relations Getters */

    List<MovieMinDTO> getFavoriteMovies();

    /* Relations Setters */

    void setFavoriteMovies(List<MovieMinDTO> movies);
}
