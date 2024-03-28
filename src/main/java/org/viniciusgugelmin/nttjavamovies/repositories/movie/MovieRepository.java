package org.viniciusgugelmin.nttjavamovies.repositories.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
