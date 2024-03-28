package org.viniciusgugelmin.nttjavamovies.repositories.actor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.actor.IActor;

public interface ActorRepository extends JpaRepository<IActor, Long> {
}
