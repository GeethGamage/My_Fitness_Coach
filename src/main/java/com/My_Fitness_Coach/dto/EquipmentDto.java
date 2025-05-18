package com.My_Fitness_Coach.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EquipmentDto {

    private int id;
    private String code;
    private String name;
    private String status;
}
