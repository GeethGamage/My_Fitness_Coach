package com.My_Fitness_Coach.service;

import com.My_Fitness_Coach.dto.EquipmentDto;

import java.util.List;

public interface WorkoutService {

    public List<EquipmentDto> findAllEquipments();
}
