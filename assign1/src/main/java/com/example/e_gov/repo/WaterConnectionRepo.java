package com.example.e_gov.repo;

import com.example.e_gov.models.WaterConnection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface WaterConnectionRepo extends JpaRepository<WaterConnection,Long>{
    @Override
    Optional<WaterConnection> findById(Long id);

    @Override
    WaterConnection save(WaterConnection waterConnection);

}
