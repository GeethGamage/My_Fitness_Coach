package com.My_Fitness_Coach.service.impl;

import com.My_Fitness_Coach.dto.EquipmentDto;
import com.My_Fitness_Coach.entity.Equipment;
import com.My_Fitness_Coach.mapper.EquipmentMapper;
import com.My_Fitness_Coach.repository.EquipmentRepository;
import com.My_Fitness_Coach.repository.ExercisesRepository;
import com.My_Fitness_Coach.repository.MuscleGroupRepository;
import com.My_Fitness_Coach.service.WorkoutService;
import com.My_Fitness_Coach.util.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class WorkoutServiceImpl implements WorkoutService {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    MuscleGroupRepository muscleGroupRepository;

    @Autowired
    ExercisesRepository exercisesRepository;


    public List<EquipmentDto> findAllEquipments() {
        List<Equipment> equipments = equipmentRepository.findAllByStatus(StatusEnum.Active.name());

        List<EquipmentDto> equipmentList = equipments.stream().
                map(EquipmentMapper.INSTANCE::mapEquipmentToEquipmentDto).collect(Collectors.toList());

        return equipmentList;
    }


}
