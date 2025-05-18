package com.My_Fitness_Coach.mapper;

import com.My_Fitness_Coach.dto.EquipmentDto;
import com.My_Fitness_Coach.dto.MuscleGroupDto;
import com.My_Fitness_Coach.entity.Equipment;
import com.My_Fitness_Coach.entity.MuscleGroup;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MuscleGroupMapper {

    MuscleGroupMapper INSTANCE = Mappers.getMapper(MuscleGroupMapper.class);

    MuscleGroup mapMuscleGroupDtoToMuscleGroup(MuscleGroupDto muscleGroupDto);

    MuscleGroupDto mapMuscleGroupToMuscleGroupDto(MuscleGroup MuscleGroup);
}
