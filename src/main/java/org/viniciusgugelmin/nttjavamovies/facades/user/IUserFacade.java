package org.viniciusgugelmin.nttjavamovies.facades.user;


import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.withoutRelations.UserWithoutRelationsDTO;

import java.util.List;
import java.util.Map;


public interface IUserFacade {
    List<MovieMinDTO> getFavorites(Long id);

    UserWithoutRelationsDTO findByName(String name);

    UserWithoutRelationsDTO addAddress(Long id, String cep);
}
