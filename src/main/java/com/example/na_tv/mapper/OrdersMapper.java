package com.example.na_tv.mapper;

import com.example.na_tv.models.DTO.OrdersDTO;
import com.example.na_tv.models.entities.Orders;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder =@Builder(disableBuilder = true))
public interface OrdersMapper extends BaseMapper<Orders , OrdersDTO> {

}