package org.viniciusgugelmin.nttjavamovies.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
