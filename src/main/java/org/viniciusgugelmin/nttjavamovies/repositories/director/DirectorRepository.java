package org.viniciusgugelmin.nttjavamovies.repositories.director;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.director.IDirector;

public interface DirectorRepository extends JpaRepository<IDirector, Long> {
}
