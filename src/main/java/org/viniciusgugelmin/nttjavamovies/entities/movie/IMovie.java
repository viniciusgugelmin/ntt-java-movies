package org.viniciusgugelmin.nttjavamovies.entities.movie;

import org.viniciusgugelmin.nttjavamovies.entities.actor.Actor;
import org.viniciusgugelmin.nttjavamovies.entities.director.Director;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.Streamming;
import org.viniciusgugelmin.nttjavamovies.entities.studio.Studio;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.time.Year;
import java.util.Date;
import java.util.List;

public interface IMovie {
    /* Getters */

    Long getImdbID();

    String getTitle();

    Date getReleased();

    Double getRuntime();

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

    Franchise getFranchise();

    List<Actor> getActors();

    List<Director> getDirectors();

    List<Streamming> getStreammings();

    List<User> getFavoritedBy();

    /* Relations Setters */

    void setGenre(Genre genre);

    void setStudio(Studio studio);

    void setFranchise(Franchise franchise);

    void setActors(List<Actor> actors);

    void setDirectors(List<Director> directors);

    void setStreammings(List<Streamming> streammings);

    void setFavoritedBy(List<User> favoriteBy);
}
