package org.viniciusgugelmin.nttjavamovies.entities.director;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.person.PersonDTO;

import java.util.List;

public interface DirectorDTO extends PersonDTO {
    /* Getters */

    Long getId();

    /* Relations Getters */

    List<Movie> getMovies();

    /* Relations Setters */

    void setMovies(List<Movie> movies);
}
