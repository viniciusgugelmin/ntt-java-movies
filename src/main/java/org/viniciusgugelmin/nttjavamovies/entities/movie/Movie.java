package org.viniciusgugelmin.nttjavamovies.entities.movie;

import jakarta.persistence.*;
import org.viniciusgugelmin.nttjavamovies.entities.actor.Actor;
import org.viniciusgugelmin.nttjavamovies.entities.director.Director;
import org.viniciusgugelmin.nttjavamovies.entities.franchise.Franchise;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;
import org.viniciusgugelmin.nttjavamovies.entities.streamming.Streamming;
import org.viniciusgugelmin.nttjavamovies.entities.studio.Studio;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "movies")
public class Movie implements IMovie {
    /* Properties */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imdbID;

    @Column(nullable = false, length = 100)
    private String Title;

    @Column(nullable = false)
    private Date Released;

    @Column(nullable = false)
    private Double Runtime;

    @Column(length = 500)
    private String Plot;

    @Column(nullable = false, length = 50)
    private String Language;

    @Column(nullable = false, length = 50)
    private String Country;

    @Column(length = 50)
    private String Awards;

    @Column(length = 100)
    private String Poster;

    /* Getters */

    @Override
    public Long getImdbID() {
        return null;
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

    @ManyToOne()
    private Genre Genre;

    @ManyToOne()
    private Studio Studio;

    @ManyToOne()
    private Franchise Franchise;

    @ManyToMany()
    private List<Actor> Actors;

    @ManyToMany()
    private List<Director> Directors;

    @ManyToMany()
    private List<Streamming> Streammings;

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
}
