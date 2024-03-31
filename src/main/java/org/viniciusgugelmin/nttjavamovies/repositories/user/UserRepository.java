package org.viniciusgugelmin.nttjavamovies.repositories.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT m FROM Movie m JOIN m.FavoritedBy u WHERE u.id = :id")
    List<Movie> getFavorites(Long id);

    Optional<User> findByName(String name);
}
