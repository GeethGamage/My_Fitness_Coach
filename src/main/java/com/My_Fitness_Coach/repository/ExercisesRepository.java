package com.My_Fitness_Coach.repository;

import com.My_Fitness_Coach.entity.Exercises;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExercisesRepository extends JpaRepository<Exercises, Integer> {
}
