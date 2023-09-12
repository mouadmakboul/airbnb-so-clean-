package com.example.demo3.Repositories;

import com.example.demo3.Entities.AccountEntity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<AccountEntity,Long> {
}
