package org.viniciusgugelmin.nttjavamovies.entities.person;

import java.util.Date;

public interface PersonDTO {
    /* Getters */

    String getName();

    Date getBirthDate();

    String getCountry();

    /* Setters */

    void setName(String name);

    void setBirthDate(Date birthDate);

    void setCountry(String country);
}
