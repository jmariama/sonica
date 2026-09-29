package com.github.jmariama.sonica.repositories;

import com.github.jmariama.sonica.entities.VinylTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event;

@Repository
public interface VinylTypeRespository extends JpaRepository<VinylTypeEntity, Long> {
}
