package org.viniciusgugelmin.nttjavamovies.facades.movie;


import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.withoutRelations.MovieWithoutRelationsDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.min.UserMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.util.List;
import java.util.Map;


public interface IMovieFacade {
    Map<String, List<MovieMinDTO>> listMoviesBySearch(String search);

    UserMinDTO controlFavorite(Long id, Long userId);

    MovieWithoutRelationsDTO changeFranchise(Long id, Long franchiseId);
}
