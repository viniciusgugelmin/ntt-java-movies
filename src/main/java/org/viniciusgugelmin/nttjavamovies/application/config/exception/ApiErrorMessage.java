package org.viniciusgugelmin.nttjavamovies.application.config.exception;

import org.springframework.http.HttpStatus;

import java.util.Arrays;
import java.util.List;

public class ApiErrorMessage {
    /* Properties */

    private HttpStatus status;
    private List<String> errors;

    /* Constructors */

    public ApiErrorMessage(HttpStatus status, List<String> errors) {
        super();
        this.status = status;
        this.errors = errors;
    }

    public ApiErrorMessage(HttpStatus status, String error) {
        super();
        this.status = status;
        errors = Arrays.asList(error);
    }

    /* Getters */

    public HttpStatus getStatus() {
        return status;
    }

    public List<String> getErrors() {
        return errors;
    }

    /* Setters */

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
