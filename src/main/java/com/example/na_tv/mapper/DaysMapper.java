package com.example.na_tv.mapper;

import com.example.na_tv.models.DTO.DaysDTO;
import com.example.na_tv.models.entities.Days;


import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder =@Builder(disableBuilder = true))
public interface DaysMapper extends BaseMapper<Days, DaysDTO> {

}