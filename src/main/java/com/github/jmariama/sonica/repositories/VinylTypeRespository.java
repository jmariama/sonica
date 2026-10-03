package com.github.jmariama.sonica.repositories;

import com.github.jmariama.sonica.entities.ArtistEntity;
import com.github.jmariama.sonica.entities.GenreEntity;
import com.github.jmariama.sonica.entities.VinylTypeEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Repository
public interface VinylTypeRespository extends JpaRepository<VinylTypeEntity, Long> {
    //get
    List<VinylTypeEntity> getGenreByName(String name);

    @Query(value = "SELECT a FROM VinylTypeEntity a WHERE LOWER(b.name) LIKE %:param%")
    Page<VinylTypeEntity> getVinylTypesBySearchParam(@Param("param") String param, Pageable pageable);
}
