package org.viniciusgugelmin.nttjavamovies.entities.genre;

public class Genre implements GenreDTO {
    /* Properties */

    private Long id;
    private String Name;

    /* Getters */

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    /* Setters */

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }
}
