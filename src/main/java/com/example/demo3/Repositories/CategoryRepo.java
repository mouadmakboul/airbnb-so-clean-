package com.example.demo3.Repositories;

import com.example.demo3.Entities.CategoryEntity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity,Long> {
}
