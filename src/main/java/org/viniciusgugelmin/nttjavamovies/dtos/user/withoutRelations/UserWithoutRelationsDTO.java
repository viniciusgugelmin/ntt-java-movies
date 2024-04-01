package org.viniciusgugelmin.nttjavamovies.dtos.user.withoutRelations;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.util.List;
import java.util.Optional;

public class UserWithoutRelationsDTO implements IUserWithoutRelationsDTO {
    /* Properties */

    private String Name;

    private Optional<String> cep;

    private Optional<String> street;

    private Optional<String> neighborhood;

    private Optional<String> city;

    private Optional<String> state;

    /* Constructors */

    public UserWithoutRelationsDTO() {
    }

    public UserWithoutRelationsDTO(User user) {
        this.Name = user.getName();
        this.cep = Optional.ofNullable(user.getCep());
        this.street = Optional.ofNullable(user.getStreet());
        this.neighborhood = Optional.ofNullable(user.getNeighborhood());
        this.city = Optional.ofNullable(user.getCity());
        this.state = Optional.ofNullable(user.getState());

        this.FavoriteMovies = MovieDTO.convertList(user.getFavoriteMovies());
    }

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
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

    @Override
    public void setName(String name) {
        this.Name = name;
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

    /* Computed */

    @Override
    public List<String> getFavoriteMoviesNames() {
        return this.FavoriteMovies.stream().map(MovieDTO::getTitle).toList();
    }

    /* Relations */

    private List<MovieDTO> FavoriteMovies;

    /* Relations Setters */

    @Override
    public void setFavoriteMovies(List<MovieDTO> movies) {
        this.FavoriteMovies = movies;
    }
}
