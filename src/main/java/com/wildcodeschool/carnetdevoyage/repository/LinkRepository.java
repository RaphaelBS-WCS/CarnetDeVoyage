package com.wildcodeschool.carnetdevoyage.repository;

import com.wildcodeschool.carnetdevoyage.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link, Integer> {
}
