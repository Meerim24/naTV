package com.example.na_tv.services.impl;

import com.example.na_tv.DAO.PriceRepo;
import com.example.na_tv.mapper.PriceMapper;
import com.example.na_tv.models.DTO.PriceDTO;
import com.example.na_tv.services.PriceService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceServiceImpl implements PriceService {
    @Autowired
    PriceMapper mapper;
    @Autowired
    PriceRepo repo;
    @Override
    public PriceDTO save(PriceDTO priceDTO) {
        return mapper.toDTO(
                repo.save(
                        mapper.toEntity(priceDTO)
                )
        );
    }

    @Override
    public PriceDTO findById(Long id) {
        return mapper.toDTO(
                repo.findById(id).orElseThrow()
        );
    }

    @Override
    public List<PriceDTO> findAll(Pageable pageable) {
        return mapper.toListDTO(repo.findAll(pageable).toList());
    }
}
