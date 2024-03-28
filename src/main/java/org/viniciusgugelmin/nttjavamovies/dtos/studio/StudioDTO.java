package org.viniciusgugelmin.nttjavamovies.dtos.studio;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.List;

public class StudioDTO implements IStudioDTO {
    /* Properties */

    private String Name;

    private String Country;

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getCountry() {
        return this.Country;
    }

    /* Setters */

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setCountry(String country) {
        this.Country = country;
    }

    /* Relations */

    private List<MovieDTO> movies;

    /* Relations Getters */

    @Override
    public List<MovieDTO> getMovies() {
        return this.movies;
    }

    /* Relations Setters */

    @Override
    public void setMovies(List<MovieDTO> movies) {
        this.movies = movies;
    }
}
