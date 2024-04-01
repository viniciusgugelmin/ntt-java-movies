package org.viniciusgugelmin.nttjavamovies.entities.user;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;
import java.util.Optional;

public interface IUser {
    /* Getters */

    Long getId();

    String getName();

    String getCep();

    String getStreet();

    String getNeighborhood();

    String getCity();

    String getState();

    /* Setters */

    void setId(Long id);

    void setName(String name);

    void setCep(String cep);

    void setStreet(String street);

    void setNeighborhood(String neighborhood);

    void setCity(String city);

    void setState(String state);

    /* Relations Getters */

    List<Movie> getFavoriteMovies();

    /* Relations Setters */

    void setFavoriteMovies(List<Movie> movies);
}
