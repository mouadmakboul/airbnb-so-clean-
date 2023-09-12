package com.example.demo3.Repositories;

import com.example.demo3.Entities.LogementEntity.LogementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface LogementRepo extends JpaRepository<LogementEntity,Long> {
}
