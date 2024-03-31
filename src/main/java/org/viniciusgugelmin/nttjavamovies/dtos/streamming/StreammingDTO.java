package org.viniciusgugelmin.nttjavamovies.dtos.streamming;

import org.viniciusgugelmin.nttjavamovies.dtos.movie.MovieDTO;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.Streamming;

import java.util.List;


public class StreammingDTO implements IStreammingDTO {

    /* Properties */

    private String Name;

    private String Url;

    /* Constructors */

    public StreammingDTO() {

    }

    public StreammingDTO(Streamming streamming) {
        this.Name = streamming.getName();
        this.Url = streamming.getUrl();
    }

    public static List<StreammingDTO> convertList(List<Streamming> streammings) {
        return streammings.stream().map(StreammingDTO::new).toList();
    }

    /* Getters */

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public String getUrl() {
        return this.Url;
    }

    /* Setters */

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setUrl(String url) {
        this.Url = url;
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
