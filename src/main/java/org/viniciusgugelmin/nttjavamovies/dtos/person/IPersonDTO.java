package org.viniciusgugelmin.nttjavamovies.dtos.person;

import java.util.Date;

public interface IPersonDTO {
    /* Getters */

    String getName();

    Date getBirthDate();

    String getCountry();

    /* Setters */

    void setName(String name);

    void setBirthDate(Date birthDate);

    void setCountry(String country);
}
