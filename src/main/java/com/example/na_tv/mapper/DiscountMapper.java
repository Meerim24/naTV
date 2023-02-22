package com.example.na_tv.mapper;

import com.example.na_tv.models.DTO.DiscountDTO;
import com.example.na_tv.models.entities.Discount;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder =@Builder(disableBuilder = true))
public interface DiscountMapper extends BaseMapper<Discount , DiscountDTO> {

}