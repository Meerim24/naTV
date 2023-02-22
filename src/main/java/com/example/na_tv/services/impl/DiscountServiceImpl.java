package com.example.na_tv.services.impl;

import com.example.na_tv.DAO.DiscountRepo;
import com.example.na_tv.mapper.DiscountMapper;
import com.example.na_tv.models.DTO.DiscountDTO;
import com.example.na_tv.services.DiscountService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    DiscountMapper mapper;
    @Autowired
    DiscountRepo repo;
    @Override
    public DiscountDTO save(DiscountDTO discountDTO) {
        return mapper.toDTO(
                repo.save(
                        mapper.toEntity(discountDTO)
                )
        );
    }

    @Override
    public DiscountDTO findById(Long id) {
        return mapper.toDTO(
                repo.findById(id).orElseThrow()
        );
    }

    @Override
    public List<DiscountDTO> findAll(Pageable pageable) {
        return mapper.toListDTO(repo.findAll(pageable).toList());
    }
}
