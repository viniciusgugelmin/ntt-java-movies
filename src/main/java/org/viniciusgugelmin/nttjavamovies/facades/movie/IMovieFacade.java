package org.viniciusgugelmin.nttjavamovies.facades.movie;


import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.withoutRelations.MovieWithoutRelationsDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.min.UserMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.util.List;
import java.util.Map;


public interface IMovieFacade {

    MovieWithoutRelationsDTO findById(Long id);

    Map<String, List<MovieMinDTO>> listMoviesBySearch(String search);

    UserMinDTO controlFavorite(Long id, Long userId);

    MovieWithoutRelationsDTO changeFranchise(Long id, Long franchiseId);

    MovieWithoutRelationsDTO addStreamming(Long id, Long streammingId);

    MovieWithoutRelationsDTO removeStreamming(Long id, Long streammingId);

    MovieWithoutRelationsDTO addActor(Long id, Long actorId);

    MovieWithoutRelationsDTO removeActor(Long id, Long actorId);

    MovieWithoutRelationsDTO addDirector(Long id, Long directorId);

    MovieWithoutRelationsDTO removeDirector(Long id, Long directorId);
}
