package org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min;

import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class MovieMinDTO implements IMovieMinDTO {
    /* Properties */

    private Long imdbID;

    private String Title;

    private Date Released;

    private Optional<String> Poster;

    /* Constructors */

    public MovieMinDTO() {
        this.Poster = Optional.empty();
    }

    public MovieMinDTO(Movie movie) {
        this.imdbID = movie.getImdbID();
        this.Title = movie.getTitle();
        this.Released = movie.getReleased();
        this.Poster = Optional.ofNullable(movie.getPoster());
    }

    public static List<MovieMinDTO> convertList(List<Movie> movies) {
        return movies.stream().map(MovieMinDTO::new).toList();
    }

    /* Getters */

    @Override
    public Long getImdbID() {
        return this.imdbID;
    }

    @Override
    public String getTitle() {
        return this.Title;
    }

    @Override
    public Optional<String> getPoster() {
        return this.Poster;
    }

    @Override
    public String getType() {
        return "movie";
    }

    /* Setters */

    @Override
    public void setImdbID(Long imdbID) {
        this.imdbID = imdbID;
    }

    @Override
    public void setTitle(String title) {
        this.Title = title;
    }

    @Override
    public void setReleased(Date released) {
        this.Released = released;
    }

    @Override
    public void setPoster(String poster) {
        this.Poster = Optional.ofNullable(poster);
    }

    /* Computed */

    @Override
    public Year getYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.Released);

        return Year.of(calendar.get(Calendar.YEAR));
    }
}
