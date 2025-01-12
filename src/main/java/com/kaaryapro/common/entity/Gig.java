package com.kaaryapro.common.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Gig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long gigId;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;
    @ManyToOne
    @JoinColumn(name = "service_id")
    private Service service;
    private String status; // Requested/In Progress/Completed
    private LocalDateTime scheduledTime;
    private LocalDateTime createdAt;
}
