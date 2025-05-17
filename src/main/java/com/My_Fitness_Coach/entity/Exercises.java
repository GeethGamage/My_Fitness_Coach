package com.My_Fitness_Coach.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "exercises")
public class Exercises {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 16, nullable = false)
    private String code;

    @Column(length = 100, nullable = false)
    private String name;

    @Column(length = 250)
    private String description;

    @ManyToOne(optional = false) // NOT NULL
    @JoinColumn(name = "muscleGroup", referencedColumnName = "code",
            nullable = false, foreignKey = @ForeignKey(name = "fk_exercises_muscle_group"))
    private MuscleGroup muscleGroup;

    @ManyToOne(optional = false) // NOT NULL
    @JoinColumn(name = "equipment", referencedColumnName = "code",
            nullable = false, foreignKey = @ForeignKey(name = "fk_exercises_equipment"))
    private Equipment equipment;

    @Column(length = 16, nullable = false)
    private String status;

}
