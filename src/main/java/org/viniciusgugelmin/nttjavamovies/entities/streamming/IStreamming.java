package org.viniciusgugelmin.nttjavamovies.entities.streamming;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

public interface IStreamming {
    /* Getters */

    public Long getId();

    public String getName();

    public String getUrl();

    /* Setters */

    public void setId(Long id);

    public void setName(String name);

    public void setUrl(String url);

    /* Relations Getters */

    public List<Movie> getMovies();

    /* Relations Setters */

    public void setMovies(List<Movie> movies);
}
