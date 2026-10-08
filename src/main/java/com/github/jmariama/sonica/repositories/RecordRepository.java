package com.github.jmariama.sonica.repositories;

import com.github.jmariama.sonica.entities.RecordEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<RecordEntity, Long> {


}
