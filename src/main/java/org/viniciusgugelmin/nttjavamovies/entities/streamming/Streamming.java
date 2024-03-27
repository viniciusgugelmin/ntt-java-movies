package org.viniciusgugelmin.nttjavamovies.entities.streamming;

import jakarta.persistence.*;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

@Entity
@Table(name = "streammings")
public class Streamming implements IStreamming {

    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String Name;

    @Column(nullable = false, length = 500)
    private String Url;

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
    public String getUrl() {
        return this.Url;
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
    public void setUrl(String url) {
        this.Url = url;
    }

    /* Relations */

    @ManyToMany()
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
