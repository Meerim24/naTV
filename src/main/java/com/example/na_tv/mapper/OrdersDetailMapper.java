package com.example.na_tv.mapper;

import com.example.na_tv.models.DTO.OrderDetailDTO;
import com.example.na_tv.models.entities.OrderDetail;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder =@Builder(disableBuilder = true))
public interface OrdersDetailMapper extends BaseMapper<OrderDetail, OrderDetailDTO> {

}