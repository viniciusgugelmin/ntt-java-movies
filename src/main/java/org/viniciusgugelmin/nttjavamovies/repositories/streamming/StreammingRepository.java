package org.viniciusgugelmin.nttjavamovies.repositories.streamming;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.IStreamming;

public interface StreammingRepository extends JpaRepository<IStreamming, Long> {
}
