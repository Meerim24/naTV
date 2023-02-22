package com.example.na_tv.mapper;


import com.example.na_tv.models.DTO.ChannelsDTO;
import com.example.na_tv.models.entities.Channels;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring",builder =@Builder(disableBuilder = true))
public interface ChannelsMapper extends BaseMapper<Channels , ChannelsDTO> {

}