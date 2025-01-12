package com.kaaryapro.common.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    @ManyToOne
    @JoinColumn(name = "gig_id")
    private Gig gig;
    private Double amount;
    private Double platformFee;
    private String status; // In-Progress/Completed
    private LocalDateTime createdAt;
}
