package com.example.na_tv.services.impl;

import com.example.na_tv.DAO.DaysRepo;
import com.example.na_tv.mapper.DaysMapper;
import com.example.na_tv.models.DTO.DaysDTO;
import com.example.na_tv.services.DaysService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DaysServiceImpl implements DaysService {
    @Autowired
    DaysMapper mapper;
    @Autowired
    DaysRepo repo;

    @Override
    public DaysDTO save(DaysDTO daysDTO) {
        return mapper.toDTO(
                repo.save(
                        mapper.toEntity(daysDTO)
                )
        );
    }

    @Override
    public DaysDTO findById(Long id) {
        return mapper.toDTO(
                repo.findById(id).orElseThrow()
        );
    }

    @Override
    public List<DaysDTO> findAll(Pageable pageable) {
        return mapper.toListDTO(repo.findAll(pageable).toList());
    }
}
