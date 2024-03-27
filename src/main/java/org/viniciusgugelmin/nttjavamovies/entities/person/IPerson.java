package org.viniciusgugelmin.nttjavamovies.entities.person;

import java.util.Date;

public interface IPerson {
    /* Getters */

    String getName();

    Date getBirthDate();

    String getCountry();

    /* Setters */

    void setName(String name);

    void setBirthDate(Date birthDate);

    void setCountry(String country);
}
