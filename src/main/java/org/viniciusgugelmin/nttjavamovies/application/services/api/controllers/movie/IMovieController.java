package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.base.IBaseController;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.withoutRelations.MovieWithoutRelationsDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.min.UserMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IMovieController extends IBaseController<Movie> {


    ResponseEntity<MovieWithoutRelationsDTO> findByIdFormatted(@PathVariable Long id);

    ResponseEntity<Map<String, List<MovieMinDTO>>> searchByTerm(@RequestParam String s);

    ResponseEntity<UserMinDTO> controlFavorite(@PathVariable Long id, @PathVariable Long userId);

    ResponseEntity<MovieWithoutRelationsDTO> changeFranchise(@PathVariable Long id, @PathVariable Long franchiseId);

    ResponseEntity<MovieWithoutRelationsDTO> addStreamming(@PathVariable Long id, @PathVariable Long streammingId);

    ResponseEntity<MovieWithoutRelationsDTO> removeStreamming(@PathVariable Long id, @PathVariable Long streammingId);

    ResponseEntity<MovieWithoutRelationsDTO> addActor(@PathVariable Long id, @PathVariable Long actorId);

    ResponseEntity<MovieWithoutRelationsDTO> removeActor(@PathVariable Long id, @PathVariable Long actorId);

    ResponseEntity<MovieWithoutRelationsDTO> addDirector(@PathVariable Long id, @PathVariable Long directorId);

    ResponseEntity<MovieWithoutRelationsDTO> removeDirector(@PathVariable Long id, @PathVariable Long directorId);
}
