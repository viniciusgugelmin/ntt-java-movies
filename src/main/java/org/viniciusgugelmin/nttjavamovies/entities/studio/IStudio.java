package org.viniciusgugelmin.nttjavamovies.entities.studio;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

public interface IStudio {
    /* Getters */

    public Long getId();

    public String getName();

    public String getCountry();

    /* Setters */

    public void setId(Long id);

    public void setName(String name);

    public void setCountry(String country);

    /* Relations Getters */

    public List<Movie> getMovies();

    /* Relations Setters */

    public void setMovies(List<Movie> movies);
}
