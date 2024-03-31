package org.viniciusgugelmin.nttjavamovies.dtos.movie.custom.withoutRelations;

import org.viniciusgugelmin.nttjavamovies.dtos.actor.ActorDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.director.DirectorDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.franchise.FranchiseDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.genre.GenreDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.streamming.StreammingDTO;
import org.viniciusgugelmin.nttjavamovies.dtos.studio.StudioDTO;
import org.viniciusgugelmin.nttjavamovies.entities.genre.Genre;
import org.viniciusgugelmin.nttjavamovies.entities.movie.Movie;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class MovieWithoutRelationsDTO implements IMovieWithoutRelationsDTO {
    /* Properties */

    private Long imdbID;

    private String Title;

    private Date Released;

    private Double Runtime;

    private Optional<String> Plot;

    private String Language;

    private String Country;

    private Optional<String> Awards;

    private Optional<String> Poster;

    /* Constructors */

    public MovieWithoutRelationsDTO() {
    }

    public MovieWithoutRelationsDTO(Movie movie) {
        this.imdbID = movie.getImdbID();
        this.Title = movie.getTitle();
        this.Released = movie.getReleased();
        this.Runtime = movie.getRuntime();
        this.Plot = Optional.ofNullable(movie.getPlot());
        this.Language = movie.getLanguage();
        this.Country = movie.getCountry();
        this.Awards = Optional.ofNullable(movie.getAwards());
        this.Poster = Optional.ofNullable(movie.getPoster());

        this.Genre = new GenreDTO(movie.getGenre());
        this.Studio = new StudioDTO(movie.getStudio());
        this.Franchise = new FranchiseDTO(movie.getFranchise());
        this.actorDTOS = ActorDTO.convertList(movie.getActors());
        this.Directors = DirectorDTO.convertList(movie.getDirectors());
        this.Streammings = StreammingDTO.convertList(movie.getStreammings());
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
    public Date getReleased() {
        return this.Released;
    }

    @Override
    public Double getRuntime() {
        return this.Runtime;
    }

    @Override
    public Optional<String> getPlot() {
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
    public Optional<String> getAwards() {
        return this.Awards;
    }

    @Override
    public Optional<String> getPoster() {
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
        this.Plot = Optional.ofNullable(plot);
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
        this.Awards = Optional.ofNullable(awards);
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

    @Override
    public String getGenreName() {
        return this.Genre.getName();
    }

    @Override
    public String getStudioName() {
        return this.Studio.getName();
    }

    @Override
    public String getFranchiseName() {
        return this.Franchise.getName();
    }

    @Override
    public List<String> getActorsNames() {
        return this.actorDTOS.stream().map(ActorDTO::getName).toList();
    }

    @Override
    public List<String> getDirectorsNames() {
        return this.Directors.stream().map(DirectorDTO::getName).toList();
    }

    @Override
    public List<String> getStreammingsNames() {
        return this.Streammings.stream().map(StreammingDTO::getName).toList();
    }

    /* Relations */

    private GenreDTO Genre;

    private StudioDTO Studio;

    private FranchiseDTO Franchise;

    private List<ActorDTO> actorDTOS;

    private List<DirectorDTO> Directors;

    private List<StreammingDTO> Streammings;

    /* Relations Setters */

    @Override
    public void setGenre(GenreDTO genre) {
        this.Genre = genre;
    }

    @Override
    public void setStudio(StudioDTO studio) {
        this.Studio = studio;
    }

    @Override
    public void setFranchise(FranchiseDTO franchise) {
        this.Franchise = franchise;
    }

    @Override
    public void setActors(List<ActorDTO> actors) {
        this.actorDTOS = actors;
    }

    @Override
    public void setDirectors(List<DirectorDTO> directors) {
        this.Directors = directors;
    }

    @Override
    public void setStreammings(List<StreammingDTO> streammings) {
        this.Streammings = streammings;
    }
}
