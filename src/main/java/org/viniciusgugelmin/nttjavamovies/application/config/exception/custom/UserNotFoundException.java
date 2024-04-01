package org.viniciusgugelmin.nttjavamovies.application.config.exception.custom;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String name) {
        super(String.format("User with name %s not found", name));
    }
}