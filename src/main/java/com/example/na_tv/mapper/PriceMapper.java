package com.example.na_tv.mapper;

import com.example.na_tv.models.DTO.PriceDTO;
import com.example.na_tv.models.entities.Price;

import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder =@Builder(disableBuilder = true))
public interface PriceMapper extends BaseMapper<Price , PriceDTO> {

}