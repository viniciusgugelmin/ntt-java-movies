package org.viniciusgugelmin.nttjavamovies.repositories.franchise;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.IFranchise;

public interface FranchiseRepository extends JpaRepository<IFranchise, Long> {
}
