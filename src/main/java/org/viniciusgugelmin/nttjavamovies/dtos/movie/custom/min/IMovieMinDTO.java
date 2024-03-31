package org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.min;

import java.time.Year;
import java.util.Date;
import java.util.Optional;

public interface IMovieMinDTO {
    /* Getters */

    Long getImdbID();

    String getTitle();

    Optional<String> getPoster();

    String getType();

    /* Setters */

    void setImdbID(Long imdbID);

    void setTitle(String title);

    void setPoster(String poster);

    void setReleased(Date released);

    /* Computed */

    Year getYear();
}
