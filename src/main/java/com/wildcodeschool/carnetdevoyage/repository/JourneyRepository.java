package com.wildcodeschool.carnetdevoyage.repository;

import com.wildcodeschool.carnetdevoyage.entity.Journey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JourneyRepository extends JpaRepository<Journey, Integer> {
}
