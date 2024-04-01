package org.viniciusgugelmin.nttjavamovies.facades.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.viniciusgugelmin.nttjavamovies.application.config.ModelMapperConfig;
import org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min.MovieMinDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.user.withoutRelations.UserWithoutRelationsDTO;
import org.viniciusgugelmin.nttjavamovies.entities.cep.CepInfo;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;
import org.viniciusgugelmin.nttjavamovies.services.cep.ICepService;
import org.viniciusgugelmin.nttjavamovies.services.user.IUserService;

import java.util.List;
import java.util.Optional;

@Service
public class UserFacade implements IUserFacade {

    private final IUserService userService;

    private final ICepService cepService;

    @Autowired
    public UserFacade(IUserService userService, ICepService cepService) {
        this.userService = userService;
        this.cepService = cepService;
    }


    @Override
    public List<MovieMinDTO> getFavorites(Long id) {
        List<Movie> movies = userService.getFavorites(id);

        return MovieMinDTO.convertList(movies);
    }

    @Override
    public UserWithoutRelationsDTO findByName(String name) {
        Optional<User> user = userService.findByName(name);

        ModelMapperConfig modelMapperConfig = new ModelMapperConfig();

        return modelMapperConfig.modelMapper().map(user.orElseThrow(), UserWithoutRelationsDTO.class);
    }

    @Override
    public UserWithoutRelationsDTO addAddress(Long id, String cep) {
        Optional<User> user = userService.findById(id);
        CepInfo cepInfo = cepService.findCep(cep);

        user.get().setCep(cepInfo.getCep());
        user.get().setCity(cepInfo.getLocalidade());
        user.get().setNeighborhood(cepInfo.getBairro());
        user.get().setState(cepInfo.getUf());
        user.get().setStreet(cepInfo.getLogradouro());

        userService.update(user.get());

        ModelMapperConfig modelMapperConfig = new ModelMapperConfig();

        return modelMapperConfig.modelMapper().map(user.orElseThrow(), UserWithoutRelationsDTO.class);
    }
}
