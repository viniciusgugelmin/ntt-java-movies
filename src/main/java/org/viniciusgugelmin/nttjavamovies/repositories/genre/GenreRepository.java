package org.viniciusgugelmin.nttjavamovies.repositories.genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
