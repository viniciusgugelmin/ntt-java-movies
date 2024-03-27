package org.viniciusgugelmin.nttjavamovies.entities.user;

import jakarta.persistence.*;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

@Entity
@Table(name = "users")
public class User implements IUser {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    /* Getters */

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    /* Setters */

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* Relations */

    @ManyToMany()
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
