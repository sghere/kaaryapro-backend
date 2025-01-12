package com.kaaryapro.common.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Worker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long workerId;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String servicesOffered;
    private Double rating;
    private String availability;
    private String location;
    private LocalDateTime createdAt;
}
