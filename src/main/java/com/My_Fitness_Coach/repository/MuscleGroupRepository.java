package com.My_Fitness_Coach.repository;

import com.My_Fitness_Coach.entity.MuscleGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuscleGroupRepository extends JpaRepository<MuscleGroup, Integer> {
}
