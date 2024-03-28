package org.viniciusgugelmin.nttjavamovies.repositories.director;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.director.Director;

public interface DirectorRepository extends JpaRepository<Director, Long> {
}
