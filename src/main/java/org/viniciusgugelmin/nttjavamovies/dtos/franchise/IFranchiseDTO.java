package org.viniciusgugelmin.nttjavamovies.dtos.franchise;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.List;

public interface IFranchiseDTO {
    /* Getters */

    public String getName();

    /* Setters */

    public void setName(String name);

    /* Relations Getters */

    public List<MovieDTO> getMovies();

    /* Relations Setters */

    public void setMovies(List<MovieDTO> movies);
}
