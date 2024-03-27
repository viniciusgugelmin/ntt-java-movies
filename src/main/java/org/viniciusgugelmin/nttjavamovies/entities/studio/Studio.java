package org.viniciusgugelmin.nttjavamovies.entities.studio;

import jakarta.persistence.*;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

@Entity
@Table(name = "studios")
public class Studio implements StudioDTO {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String Name;

    @Column(nullable = false, length = 100)
    private String Country;

    /* Getters */

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getCountry() {
        return this.Country;
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

    @Override
    public void setCountry(String country) {
        this.Country = country;
    }

    /* Relations */

    @OneToMany()
    private List<Movie> movies;

    /* Relations Getters */

    @Override
    public List<Movie> getMovies() {
        return this.movies;
    }

    /* Relations Setters */

    @Override
    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
