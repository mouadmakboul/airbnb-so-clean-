package com.example.demo3.Repositories;

import com.example.demo3.Entities.ImageEntity.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepo extends JpaRepository<ImageEntity,Long> {
}
