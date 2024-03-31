package org.viniciusgugelmin.nttjavamovies.repositories.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    @Query("SELECT m FROM Movie m WHERE m.Title LIKE %:Title%")
    List<Movie> getMoviesByTitle(String Title);
}
