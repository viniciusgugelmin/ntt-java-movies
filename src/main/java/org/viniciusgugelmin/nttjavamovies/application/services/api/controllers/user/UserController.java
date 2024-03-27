package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.viniciusgugelmin.nttjavamovies.entities.user.IUser;

@RestController
@RequestMapping(value = "/user")
public class UserController implements IUserController {
    @PostMapping(value = "/save")
    @Override
    public ResponseEntity<IUser> save(@RequestBody IUser user) {
        return null;
    }
}
