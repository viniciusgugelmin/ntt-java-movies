package org.viniciusgugelmin.nttjavamovies.dtos.franchise;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;

import java.util.List;

public class FranchiseDTO implements IFranchiseDTO {
    /* Properties */

    private String Name;

    /* Constructors */

    public FranchiseDTO() {

    }

    public FranchiseDTO(Franchise franchise) {
        this.Name = franchise.getName();
    }

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
    }

    /* Setters */

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    /* Relations */

    private List<MovieDTO> Movies;

    /* Relations Getters */

    @Override
    public List<MovieDTO> getMovies() {
        return this.Movies;
    }

    /* Relations Setters */

    @Override
    public void setMovies(List<MovieDTO> movies) {
        this.Movies = movies;
    }
}
