package org.viniciusgugelmin.nttjavamovies.entities.movie;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.viniciusgugelmin.nttjavamovies.entities.actor.Actor;
import org.viniciusgugelmin.nttjavamovies.entities.director.Director;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.Streamming;
import org.viniciusgugelmin.nttjavamovies.entities.studio.Studio;
import org.viniciusgugelmin.nttjavamovies.entities.user.User;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "imdbID")
@Table(name = "movies")
public class Movie implements IMovie {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imdbID;

    @NotNull
    @Length(max = 100)
    private String Title;

    @NotNull
    private Date Released;

    @NotNull
    private Double Runtime;

    @Length(max = 500)
    private String Plot;

    @NotNull
    @Length(max = 50)
    private String Language;

    @NotNull
    @Length(max = 50)
    private String Country;

    @Length(max = 100)
    private String Awards;

    @Length(max = 100)
    private String Poster;

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
    public Date getReleased() {
        return this.Released;
    }

    @Override
    public Double getRuntime() {
        return this.Runtime;
    }

    @Override
    public String getPlot() {
        return this.Plot;
    }

    @Override
    public String getLanguage() {
        return this.Language;
    }

    @Override
    public String getCountry() {
        return this.Country;
    }

    @Override
    public String getAwards() {
        return this.Awards;
    }

    @Override
    public String getPoster() {
        return this.Poster;
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
    public void setRuntime(Double runtime) {
        this.Runtime = runtime;
    }

    @Override
    public void setPlot(String plot) {
        this.Plot = plot;
    }

    @Override
    public void setLanguage(String language) {
        this.Language = language;
    }

    @Override
    public void setCountry(String country) {
        this.Country = country;
    }

    @Override
    public void setAwards(String awards) {
        this.Awards = awards;
    }

    @Override
    public void setPoster(String poster) {
        this.Poster = poster;
    }

    /* Computed */

    @Override
    public Year getYear() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.Released);

        return Year.of(calendar.get(Calendar.YEAR));
    }

    /* Relations */

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre Genre;

    @ManyToOne
    @JoinColumn(name = "studio_id")
    private Studio Studio;

    @ManyToOne
    @JoinColumn(name = "franchise_id")
    private Franchise Franchise;

    @ManyToMany
    @JoinTable(
            name = "movie_actor",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private List<Actor> Actors;

    @ManyToMany
    @JoinTable(
            name = "movie_director",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "director_id")
    )
    private List<Director> Directors;

    @ManyToMany
    @JoinTable(
            name = "movie_streamming",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "streamming_id")
    )
    private List<Streamming> Streammings;

    @ManyToMany
    @JoinTable(
            name = "movie_user",
            joinColumns = @JoinColumn(name = "movie_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> FavoritedBy;

    /* Relations Getters */

    @Override
    public Genre getGenre() {
        return this.Genre;
    }

    @Override
    public Studio getStudio() {
        return this.Studio;
    }

    @Override
    public Franchise getFranchise() {
        return this.Franchise;
    }

    @Override
    public List<Actor> getActors() {
        return this.Actors;
    }

    @Override
    public List<Director> getDirectors() {
        return this.Directors;
    }

    @Override
    public List<Streamming> getStreammings() {
        return this.Streammings;
    }

    @Override
    public List<User> getFavoritedBy() {
        return this.FavoritedBy;
    }

    /* Relations Setters */

    @Override
    public void setGenre(Genre genre) {
        this.Genre = genre;
    }

    @Override
    public void setStudio(Studio studio) {
        this.Studio = studio;
    }

    @Override
    public void setFranchise(Franchise franchise) {
        this.Franchise = franchise;
    }

    @Override
    public void setActors(List<Actor> actors) {
        this.Actors = actors;
    }

    @Override
    public void setDirectors(List<Director> directors) {
        this.Directors = directors;
    }

    @Override
    public void setStreammings(List<Streamming> streammings) {
        this.Streammings = streammings;
    }

    @Override
    public void setFavoritedBy(List<User> users) {
        this.FavoritedBy = users;
    }
}
