package org.viniciusgugelmin.nttjavamovies.dtos.actor;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.entities.actor.Actor;

import java.util.Date;
import java.util.List;


public class ActorDTO implements IActorDTO {
    /* Properties */

    private String Name;

    private Date Birthdate;

    private String Country;

    /* Constructors */

    public ActorDTO() {

    }

    public ActorDTO(Actor actor) {
        this.Name = actor.getName();
        this.Birthdate = actor.getBirthDate();
        this.Country = actor.getCountry();
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

    public List<MovieDTO> getMovies() {
        return this.Movies;
    }

    /* Relations Setters */

    public void setMovies(List<MovieDTO> movies) {
        this.Movies = movies;
    }
}
