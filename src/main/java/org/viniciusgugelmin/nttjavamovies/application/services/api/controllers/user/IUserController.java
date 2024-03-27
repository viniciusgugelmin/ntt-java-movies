package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.viniciusgugelmin.nttjavamovies.entities.user.IUser;

public interface IUserController {
    ResponseEntity<IUser> save(@RequestBody IUser user);
}
