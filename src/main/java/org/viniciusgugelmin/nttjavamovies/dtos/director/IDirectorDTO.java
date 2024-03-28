package org.viniciusgugelmin.nttjavamovies.dtos.director;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.person.IPersonDTO;

import java.util.List;

public interface IDirectorDTO extends IPersonDTO {
    /* Relations Getters */

    List<MovieDTO> getMovies();

    /* Relations Setters */

    void setMovies(List<MovieDTO> movies);
}
