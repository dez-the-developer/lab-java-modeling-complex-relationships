package com.ironhack.modelingcomplexrelationships.nurseassociation.model;

import jakarta.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentationDuration;

    // Getters and setters
}
