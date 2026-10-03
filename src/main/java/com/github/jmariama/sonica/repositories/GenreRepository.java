package com.github.jmariama.sonica.repositories;

import com.github.jmariama.sonica.entities.ArtistEntity;
import com.github.jmariama.sonica.entities.GenreEntity;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GenreRepository extends JpaRepository<GenreEntity, Long> {
    List<GenreEntity> getGenreByName(String name);
    @Query(value = "SELECT a FROM GenreEntity a WHERE LOWER(b.name) LIKE %:param%")
    Page<ArtistEntity> getGenreBySearchParam(@Param("param") String param, Pageable pageable);
}
