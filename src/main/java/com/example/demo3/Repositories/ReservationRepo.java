package com.example.demo3.Repositories;

import com.example.demo3.Entities.ReservationEntity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReservationRepo extends JpaRepository<ReservationEntity,Long> {
}
