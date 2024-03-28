package org.viniciusgugelmin.nttjavamovies.entities.director;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.person.IPerson;

import java.util.List;

public interface IDirector extends IPerson {
    /* Getters */

    Long getId();

    /* Setters */

    void setId(Long id);

    /* Relations Getters */

    List<Movie> getMovies();

    /* Relations Setters */

    void setMovies(List<Movie> movies);
}
