package com.example.demo3.Repositories;

import com.example.demo3.Entities.EmplacementEntity.EmplacementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplacementRepo extends JpaRepository<EmplacementEntity,Long> {
}
