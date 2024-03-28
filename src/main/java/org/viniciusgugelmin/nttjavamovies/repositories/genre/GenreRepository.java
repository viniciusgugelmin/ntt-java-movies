package org.viniciusgugelmin.nttjavamovies.repositories.genre;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.genre.IGenre;

public interface GenreRepository extends JpaRepository<IGenre, Long> {
}
