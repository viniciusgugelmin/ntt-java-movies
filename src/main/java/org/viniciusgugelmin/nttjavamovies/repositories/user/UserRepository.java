package org.viniciusgugelmin.nttjavamovies.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.user.IUser;

public interface UserRepository extends JpaRepository<IUser, Long> {
}
