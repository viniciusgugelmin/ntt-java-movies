package org.viniciusgugelmin.nttjavamovies.dtos.user.withoutRelations;

import org.viniciusgugelmin.nttjavamovies.dtos.actor.ActorDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.director.DirectorDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.franchise.FranchiseDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.genre.GenreDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.streamming.StreammingDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.studio.StudioDTO;

import java.time.Year;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IUserWithoutRelationsDTO {
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

    /* Computed */

    List<String> getFavoriteMoviesNames();

    /* Relations Setters */

    void setFavoriteMovies(List<MovieDTO> movies);
}
