package org.viniciusgugelmin.nttjavamovies.dtos.studio;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.List;

public interface IStudioDTO {
    /* Getters */

    public String getName();

    public String getCountry();

    /* Setters */

    public void setName(String name);

    public void setCountry(String country);

    /* Relations Getters */

    public List<MovieDTO> getMovies();

    /* Relations Setters */

    public void setMovies(List<MovieDTO> movies);
}
