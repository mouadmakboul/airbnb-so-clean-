package com.example.demo3.Repositories;

import com.example.demo3.Entities.RatingEntity.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RatingRepo extends JpaRepository<RatingEntity,Long> {
}
