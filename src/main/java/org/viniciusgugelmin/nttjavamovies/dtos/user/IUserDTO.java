package org.viniciusgugelmin.nttjavamovies.dtos.user;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;

import java.util.List;
import java.util.Optional;

public interface IUserDTO {
    /* Getters */

    String getName();

    Optional<String> getCep();

    Optional<String> getStreet();

    Optional<String> getNeighborhood();

    Optional<String> getCity();

    Optional<String> getState();

    /* Setters */

    void setName(String name);

    void setCep(String cep);

    void setStreet(String street);

    void setNeighborhood(String neighborhood);

    void setCity(String city);

    void setState(String state);

    /* Relations Getters */

    List<MovieDTO> getFavoriteMovies();

    /* Relations Setters */

    void setFavoriteMovies(List<MovieDTO> movies);
}
