package com.example.demo3.Entities.RatingEntity;

import com.example.demo3.Entities.LogementEntity.LogementEntity;
import com.example.demo3.Entities.PayementEntity.PayementEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "ratings")
public class RatingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Rating_id", nullable = false)
    private long id;
    private String rating;
    @OneToOne
    private LogementEntity logement; //jatni hana 3la reservation
}
