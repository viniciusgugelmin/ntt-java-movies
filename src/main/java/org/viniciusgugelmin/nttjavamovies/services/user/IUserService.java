package org.viniciusgugelmin.nttjavamovies.services.user;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.services.base.IBaseService;

import java.util.List;
import java.util.Optional;

public interface IUserService extends IBaseService<User> {
    List<Movie> getFavorites(Long id);

    Optional<User> findByName(String name);
}
