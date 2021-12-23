package com.wildcodeschool.carnetdevoyage.repository;

import com.wildcodeschool.carnetdevoyage.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Integer> {
}
