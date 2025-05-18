package com.My_Fitness_Coach.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MuscleGroupDto {

    private int id;
    private String code;
    private String name;
    private String status;
}
