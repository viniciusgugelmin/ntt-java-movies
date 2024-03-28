package org.viniciusgugelmin.nttjavamovies.repositories.franchise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;

public interface FranchiseRepository extends JpaRepository<Franchise, Long> {
}
