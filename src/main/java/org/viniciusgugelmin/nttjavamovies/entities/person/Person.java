package org.viniciusgugelmin.nttjavamovies.entities.person;

import java.util.Date;

public abstract class Person implements PersonDTO {
    /* Properties */

    protected String Name;

    protected Date BirthDate;

    protected String Country;

    /* Getters */

    public String getName() {
        return this.Name;
    }

    public Date getBirthDate() {
        return this.BirthDate;
    }

    public String getCountry() {
        return this.Country;
    }

    /* Setters */

    public void setName(String name) {
        this.Name = name;
    }

    public void setBirthDate(Date birthDate) {
        this.BirthDate = birthDate;
    }

    public void setCountry(String country) {
        this.Country = country;
    }
}
