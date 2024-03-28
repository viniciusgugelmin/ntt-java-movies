package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.user;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.services.user.IUserService;

@Tag(name = "User")
@RestController
@RequestMapping(value = "/user")
public class UserController implements IUserController {
    private final IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping(value = "/save")
    @Override
    public ResponseEntity<User> save(@RequestBody User user) {
        User newUser = this.userService.create(user);

        return ResponseEntity.ok(newUser);
    }
}
