package com.github.jmariama.sonica.repositories;

import com.github.jmariama.sonica.entities.ArtistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository  extends JpaRepository<ArtistEntity, Long> {
}
