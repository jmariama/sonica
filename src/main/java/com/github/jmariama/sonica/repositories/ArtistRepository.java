package com.github.jmariama.sonica.repositories;

import com.github.jmariama.sonica.entities.ArtistEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ArtistRepository  extends JpaRepository<ArtistEntity, Long> {
    ArtistEntity addArtist(ArtistEntity artist);
    List<ArtistEntity> geArtistsByName(String name);
    @Query(value = "SELECT a FROM ArtistEntity a WHERE LOWER(b.name) LIKE %:param%")
    Page<ArtistEntity> getArtistsBySearchParam(@Param("param") String param, Pageable pageable);
    void deleteArtistByName(String name);
}
