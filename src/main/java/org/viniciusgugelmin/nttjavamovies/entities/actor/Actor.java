package org.viniciusgugelmin.nttjavamovies.entities.actor;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Actor implements ActorDTO {
    /* Properties */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String Name;

    @Column(nullable = false)
    private Date Birthdate;

    @Column(nullable = false, length = 50)
    private String Country;

    /* Getters */

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.Name;
    }

    @Override
    public Date getBirthDate() {
        return null;
    }

    @Override
    public String getCountry() {
        return null;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public void setBirthDate(Date birthDate) {
        this.Birthdate = birthDate;
    }

    @Override
    public void setCountry(String country) {
        this.Country = country;
    }
}
