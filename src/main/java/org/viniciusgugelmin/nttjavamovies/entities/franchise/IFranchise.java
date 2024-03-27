package org.viniciusgugelmin.nttjavamovies.entities.franchise;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

public interface IFranchise {
    /* Getters */

    public Long getId();

    public String getName();

    /* Setters */

    public void setId(Long id);

    public void setName(String name);

    /* Relations Getters */

    public List<Movie> getMovies();

    /* Relations Setters */

    public void setMovies(List<Movie> movies);
}
