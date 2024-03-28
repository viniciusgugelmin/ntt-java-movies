package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.base;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

public interface IBaseController<T> {
    ResponseEntity<List<T>> findAll();

    ResponseEntity<Optional<T>> findById(@PathVariable Long id);

    ResponseEntity<T> save(@RequestBody  T object);

    ResponseEntity<T> update(@RequestBody T object);

    ResponseEntity<Boolean> delete(@PathVariable Long id);
}
