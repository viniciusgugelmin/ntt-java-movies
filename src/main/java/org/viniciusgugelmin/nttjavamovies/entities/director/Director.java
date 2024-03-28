package org.viniciusgugelmin.nttjavamovies.entities.director;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "directors")
public class Director implements IDirector {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(max = 100)
    private String Name;

    @NotNull
    private Date Birthdate;

    @NotNull
    @Length(max = 50)
    private String Country;

    /* Getters */

    @Override
    public Long getId() {
        return this.id;
    }

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
    public void setId(Long id) {
        this.id = id;
    }

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

    @ManyToMany
    private List<Movie> Movies;

    /* Relations Getters */

    @Override
    public List<Movie> getMovies() {
        return this.Movies;
    }

    /* Relations Setters */

    @Override
    public void setMovies(List<Movie> movies) {
        this.Movies = movies;
    }
}
