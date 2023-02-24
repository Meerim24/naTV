package com.example.na_tv.services.impl;

import com.example.na_tv.DAO.ChannelsRepo;
import com.example.na_tv.mapper.ChannelsMapper;
import com.example.na_tv.models.DTO.ChannelsDTO;
import com.example.na_tv.services.ChannelService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelServiceImpl implements ChannelService {
    @Autowired
    ChannelsMapper mapper;
    @Autowired
    ChannelsRepo repo;



    @Override
    public ChannelsDTO save(ChannelsDTO dto) {
        return mapper.toDTO(
                repo.save(
                    mapper.toEntity(dto)
                )
        );
    }

    @Override
    public ChannelsDTO findById(Long id) {
        return mapper.toDTO(
                repo.findById(id)
                        .orElseThrow()
        );//TODO Нужно создать exception
    }

    @Override
    public List<ChannelsDTO> findAll(Pageable pageable) {
        return mapper.toListDTO(repo.findAll(pageable).toList());
    }
}
