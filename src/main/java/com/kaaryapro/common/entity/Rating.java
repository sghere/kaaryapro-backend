package com.kaaryapro.common.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ratingId;
    @ManyToOne
    @JoinColumn(name = "gig_id")
    private Gig gig;
    private int rating; // 1-5
    private String feedback;
    private LocalDateTime createdAt;
}
