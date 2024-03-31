package org.viniciusgugelmin.nttjavamovies.dtos.user.min;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class UserMinDTO implements IUserMinDTO {
    /* Properties */

    private String name;

    /* Constructors */

    public UserMinDTO() {

    }

    public UserMinDTO(User user) {
        this.name = user.getName();
        this.FavoriteMovies = MovieMinDTO.convertList(user.getFavoriteMovies());
    }

    /* Getters */

    public String getName() {
        return this.name;
    }

    /* Setters */

    public void setName(String name) {
        this.name = name;
    }

    /* Relations */

    private List<MovieMinDTO> FavoriteMovies;

    /* Relations Getters */

    @Override
    public List<MovieMinDTO> getFavoriteMovies() {
        return this.FavoriteMovies;
    }

    /* Relations Setters */

    @Override
    public void setFavoriteMovies(List<MovieMinDTO> movies) {
        this.FavoriteMovies = movies;
    }
}
