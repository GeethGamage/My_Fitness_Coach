package com.My_Fitness_Coach.mapper;

import com.My_Fitness_Coach.dto.EquipmentDto;
import com.My_Fitness_Coach.entity.Equipment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EquipmentMapper {

    EquipmentMapper INSTANCE = Mappers.getMapper(EquipmentMapper.class);

    Equipment mapEquipmentDtoToEquipment(EquipmentDto equipmentDto);

    EquipmentDto mapEquipmentToEquipmentDto(Equipment equipment);
}
