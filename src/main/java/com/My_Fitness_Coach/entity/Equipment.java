package com.My_Fitness_Coach.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 16, nullable = false, unique = true)
    private String code;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 16, nullable = false)
    private String status;

}
