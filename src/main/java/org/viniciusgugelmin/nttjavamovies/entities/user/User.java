package org.viniciusgugelmin.nttjavamovies.entities.user;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Table(name = "users")
public class User implements IUser {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Length(max = 100)
    private String name;

    @Length(max = 100)
    private String street;

    @Length(max = 50)
    private String cep;

    @Length(max = 100)
    private String neighborhood;

    @Length(max = 100)
    private String city;

    @Length(max = 100)
    private String state;

    /* Getters */

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCep() {
        return this.cep;
    }

    public String getStreet() {
        return this.street;
    }

    public String getNeighborhood() {
        return this.neighborhood;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    /* Setters */

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    /* Relations */

    @ManyToMany(mappedBy = "FavoritedBy")
    private List<Movie> FavoriteMovies;

    /* Relations Getters */

    @Override
    public List<Movie> getFavoriteMovies() {
        return this.FavoriteMovies;
    }

    /* Relations Setters */

    @Override
    public void setFavoriteMovies(List<Movie> movies) {
        this.FavoriteMovies = movies;
    }
}
