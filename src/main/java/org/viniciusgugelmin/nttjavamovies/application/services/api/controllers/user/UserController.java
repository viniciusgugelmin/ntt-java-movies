package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.user;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.facades.user.IUserFacade;
import org.viniciusgugelmin.nttjavamovies.services.user.IUserService;

import java.util.List;
import java.util.Optional;

@Tag(name = "User")
@RestController
@RequestMapping(value = "/user")
public class UserController implements IUserController {
    private final IUserService userService;

    private final IUserFacade userFacade;

    @Autowired
    public UserController(IUserService userService, IUserFacade userFacade) {
        this.userService = userService;
        this.userFacade = userFacade;
    }

    @GetMapping(value = "/{name}")
    @Override
    public ResponseEntity<Optional<User>> findByName(@PathVariable String name) {
        Optional<User> user = this.userService.findByName(name);

        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/{id}/favorites")
    @Override
    public ResponseEntity<List<MovieMinDTO>> getFavorites(@PathVariable Long id) {
        List<MovieMinDTO> favorites = this.userFacade.getFavorites(id);

        return ResponseEntity.ok(favorites);
    }

    @PostMapping(value = "/save")
    @Override
    public ResponseEntity<User> save(@RequestBody User user) {
        User newUser = this.userService.create(user);

        return ResponseEntity.ok(newUser);
    }
}
