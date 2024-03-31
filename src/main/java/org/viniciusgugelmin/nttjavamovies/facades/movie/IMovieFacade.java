package org.viniciusgugelmin.nttjavamovies.facades.movie;


import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.util.List;
import java.util.Map;


public interface IMovieFacade {
    Map<String, List<MovieMinDTO>> listMoviesBySearch(String search);

    User controlFavorite(Long id, Long userId);
}
