package com.My_Fitness_Coach.controller;

import com.My_Fitness_Coach.dto.EquipmentDto;
import com.My_Fitness_Coach.service.WorkoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workout")
public class WorkoutController {

    @Autowired
    WorkoutService workoutService;

    @GetMapping("/equipments")
    public ResponseEntity<List<EquipmentDto>> getAllEquipments(){
        List<EquipmentDto> equipments = workoutService.findAllEquipments();
        return new ResponseEntity<>(equipments, HttpStatus.OK);
    }
}
