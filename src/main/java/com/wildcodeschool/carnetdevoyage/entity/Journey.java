package com.wildcodeschool.carnetdevoyage.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Journey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String country;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate jStart;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate jEnd;

    @OneToMany(mappedBy = "journey", cascade = CascadeType.ALL)
    private List<City> cities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getjStart() {
        return jStart;
    }

    public void setjStart(LocalDate jStart) {
        this.jStart = jStart;
    }

    public LocalDate getjEnd() {
        return jEnd;
    }

    public void setjEnd(LocalDate jEnd) {
        this.jEnd = jEnd;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
