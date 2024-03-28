package org.viniciusgugelmin.nttjavamovies.repositories.studio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.studio.IStudio;

public interface StudioRepository extends JpaRepository<IStudio, Long> {
}
