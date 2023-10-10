package com.example.demo3.Repositories;

import com.example.demo3.Entities.EquipementEntity.EquipementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipementRepo extends JpaRepository<EquipementEntity,Long> {
    EquipementEntity findByNameEquipement(String nameEquipement);

    boolean existsByNameEquipement(String nameEquipement);
}
