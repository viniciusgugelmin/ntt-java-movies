package org.viniciusgugelmin.nttjavamovies.entities.movie;

import java.time.Year;
import java.util.Date;

public interface MovieDTO {
    /* Properties */

    Long imdbID = null;
    String Title = null;
    Date Released = null;
    Double Runtime = null;
    String Genre = null;
    /*Director Director;*/
    /*ArrayList<Actor> Actors;*/
    String Plot = null;
    String Language = null;
    String Country = null;
    String Awards = null;
    String Poster = null;

    /* Getters */

    Long getImdbID();

    String getTitle();

    Date getReleased();

    Double getRuntime();

    String getGenre();

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

    void setGenre(String genre);

    /*void setDirector(Director director);*/

    /*void setActors(ArrayList<Actor> actors);*/

    void setPlot(String plot);

    void setLanguage(String language);

    void setCountry(String country);

    void setAwards(String awards);

    void setPoster(String poster);

    /* Computed */

    Year getYear();
}
