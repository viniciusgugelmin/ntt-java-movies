package org.viniciusgugelmin.nttjavamovies.dtos.genre;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;

import java.util.List;

public class GenreDTO implements IGenreDTO {
    /* Properties */

    private String Name;

    /* Constructors */

    public GenreDTO() {
    }

    public GenreDTO(Genre genre) {
        this.Name = genre.getName();
    }

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
    }

    /* Setters */

    @Override
    public void setName(String name) {
        this.Name = name;
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
