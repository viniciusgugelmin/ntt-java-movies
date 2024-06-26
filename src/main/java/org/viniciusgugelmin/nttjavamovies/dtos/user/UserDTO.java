package org.viniciusgugelmin.nttjavamovies.dtos.user;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.List;
import java.util.Optional;

public class UserDTO implements IUserDTO {
    /* Properties */

    private String name;

    private Optional<String> cep;

    private Optional<String> street;

    private Optional<String> neighborhood;

    private Optional<String> city;

    private Optional<String> state;

    /* Getters */

    public String getName() {
        return this.name;
    }

    public Optional<String> getCep() {
        return this.cep;
    }

    public Optional<String> getStreet() {
        return this.street;
    }

    public Optional<String> getNeighborhood() {
        return this.neighborhood;
    }

    public Optional<String> getCity() {
        return this.city;
    }

    public Optional<String> getState() {
        return this.state;
    }

    /* Setters */

    public void setName(String name) {
        this.name = name;
    }

    public void setCep(String cep) {
        this.cep = Optional.ofNullable(cep);
    }

    public void setStreet(String street) {
        this.street = Optional.ofNullable(street);
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = Optional.ofNullable(neighborhood);
    }

    public void setCity(String city) {
        this.city = Optional.ofNullable(city);
    }

    public void setState(String state) {
        this.state = Optional.ofNullable(state);
    }

    /* Relations */

    private List<MovieDTO> FavoriteMovies;

    /* Relations Getters */

    @Override
    public List<MovieDTO> getFavoriteMovies() {
        return this.FavoriteMovies;
    }

    /* Relations Setters */

    @Override
    public void setFavoriteMovies(List<MovieDTO> movies) {
        this.FavoriteMovies = movies;
    }
}
