package com.github.jmariama.sonica.repositories;

import com.github.jmariama.sonica.entities.GenreEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
}
