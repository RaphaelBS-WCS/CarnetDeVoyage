package com.wildcodeschool.carnetdevoyage.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String Country;
    private Date jStart;
    private Date jEnd;

    @OneToMany(mappedBy = "journey", cascade = CascadeType.ALL)
    private List<City> cities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public Date getjStart() {
        return jStart;
    }

    public void setjStart(Date jStart) {
        this.jStart = jStart;
    }

    public Date getjEnd() {
        return jEnd;
    }

    public void setjEnd(Date jEnd) {
        this.jEnd = jEnd;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
