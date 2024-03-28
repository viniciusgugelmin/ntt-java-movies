package org.viniciusgugelmin.nttjavamovies.repositories.studio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.studio.Studio;

public interface StudioRepository extends JpaRepository<Studio, Long> {
}
