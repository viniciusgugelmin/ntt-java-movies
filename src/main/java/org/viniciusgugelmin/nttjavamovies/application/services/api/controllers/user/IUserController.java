package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.util.List;
import java.util.Optional;

public interface IUserController {
    ResponseEntity<User> save(@RequestBody User user);

    ResponseEntity<List<MovieMinDTO>> getFavorites(@PathVariable Long id);

    ResponseEntity<Optional<User>> findByName(@PathVariable String name);
}
