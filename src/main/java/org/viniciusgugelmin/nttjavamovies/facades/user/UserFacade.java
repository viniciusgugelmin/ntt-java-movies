package org.viniciusgugelmin.nttjavamovies.facades.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.services.user.IUserService;

import java.util.List;

@Service
public class UserFacade implements IUserFacade {

    private final IUserService userService;

    @Autowired
    public UserFacade(IUserService userService) {
        this.userService = userService;
    }


    @Override
    public List<MovieMinDTO> getFavorites(Long id) {
        List<Movie> movies = userService.getFavorites(id);

        return MovieMinDTO.convertList(movies);
    }
}
