package org.viniciusgugelmin.nttjavamovies.entities.movie;

import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;
import org.viniciusgugelmin.nttjavamovies.entities.studio.Studio;

import java.time.Year;
import java.util.Date;

public interface MovieDTO {
    /* Getters */

    Long getImdbID();

    String getTitle();

    Date getReleased();

    Double getRuntime();

    /*Director getDirector();*/

    /*ArrayList<Actor> getActors();*/

    String getPlot();

    String getLanguage();

    String getCountry();

    String getAwards();

    String getPoster();

    /* Setters */

    void setImdbID(Long imdbID);

    void setTitle(String title);

    void setReleased(Date released);

    void setRuntime(Double runtime);

    /*void setDirector(Director director);*/

    /*void setActors(ArrayList<Actor> actors);*/

    void setPlot(String plot);

    void setLanguage(String language);

    void setCountry(String country);

    void setAwards(String awards);

    void setPoster(String poster);

    /* Computed */

    Year getYear();

    /* Relations Getters */

    Genre getGenre();

    Studio getStudio();

    /* Relations Setters */

    void setGenre(Genre genre);

    void setStudio(Studio studio);
}
