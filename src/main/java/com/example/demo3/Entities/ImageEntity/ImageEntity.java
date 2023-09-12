package com.example.demo3.Entities.ImageEntity;

import com.example.demo3.Entities.LogementEntity.LogementEntity;
import com.example.demo3.Entities.RatingEntity.RatingEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "images")
public class ImageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Image_id", nullable = false)
    private long id;
    private String path;
    @OneToOne
    private LogementEntity logement;


}
