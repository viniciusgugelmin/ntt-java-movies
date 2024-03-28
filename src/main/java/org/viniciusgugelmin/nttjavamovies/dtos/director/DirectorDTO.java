package org.viniciusgugelmin.nttjavamovies.dtos.director;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.Date;
import java.util.List;

public class DirectorDTO implements IDirectorDTO {
    /* Properties */

    private String Name;

    private Date Birthdate;

    private String Country;

    /* Constructors */

    public DirectorDTO() {

    }

    public DirectorDTO(DirectorDTO director) {
        this.Name = director.getName();
        this.Birthdate = director.getBirthDate();
        this.Country = director.getCountry();
    }

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Date getBirthDate() {
        return this.Birthdate;
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
    public void setBirthDate(Date birthDate) {
        this.Birthdate = birthDate;
    }

    @Override
    public void setCountry(String country) {
        this.Country = country;
    }

    /* Relations */

    private List<MovieDTO> Movies;

    /* Relations Getters */

    @Override
    public List<MovieDTO> getMovies() {
        return this.Movies;
    }

    /* Relations Setters */

    @Override
    public void setMovies(List<MovieDTO> movies) {
        this.Movies = movies;
    }
}
