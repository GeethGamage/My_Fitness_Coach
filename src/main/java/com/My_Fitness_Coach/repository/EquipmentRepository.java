package com.My_Fitness_Coach.repository;

import com.My_Fitness_Coach.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer>{

    public List<Equipment> findAllByStatus(String status);
}
