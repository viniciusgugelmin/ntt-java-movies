package org.viniciusgugelmin.nttjavamovies.services.base;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T> {
    List<T> list();

    Optional<T> findById(Long id);

    T create(T object);

    T update(T object);

    void delete(Long id);
}
