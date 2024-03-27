package org.viniciusgugelmin.nttjavamovies.entities.genre;

import jakarta.persistence.*;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

@Entity
@Table(name = "genres")
public class Genre implements GenreDTO {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;

    /* Getters */

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.Name;
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

    /* Relations */

    @OneToMany()
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
