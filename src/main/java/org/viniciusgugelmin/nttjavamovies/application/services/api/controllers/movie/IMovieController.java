package org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.viniciusgugelmin.nttjavamovies.application.services.api.controllers.base.IBaseController;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.util.List;
import java.util.Map;

public interface IMovieController extends IBaseController<Movie> {
    ResponseEntity<Map<String, List<MovieMinDTO>>> searchByTerm(@RequestParam String s);

    ResponseEntity<User> controlFavorite(@PathVariable Long id, @PathVariable Long userId);
}
