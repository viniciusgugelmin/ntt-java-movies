package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

public interface IUserController {
    ResponseEntity<User> save(@RequestBody User user);
}
