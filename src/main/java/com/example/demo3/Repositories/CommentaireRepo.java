package com.example.demo3.Repositories;

import com.example.demo3.Entities.CommentaireEntity.CommentaireEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentaireRepo extends JpaRepository<CommentaireEntity,Long> {
}
