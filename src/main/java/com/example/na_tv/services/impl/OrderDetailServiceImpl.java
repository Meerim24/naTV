package com.example.na_tv.services.impl;

import com.example.na_tv.DAO.OrderDetailRepo;
import com.example.na_tv.mapper.OrdersDetailMapper;
import com.example.na_tv.models.DTO.OrderDetailDTO;
import com.example.na_tv.services.OrderDetailService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailServiceImpl implements OrderDetailService {
    @Autowired
    OrdersDetailMapper mapper;
    @Autowired
    OrderDetailRepo repo;
    @Override
    public OrderDetailDTO save(OrderDetailDTO orderDetailDTO) {
        return mapper.toDTO(
                repo.save(
                        mapper.toEntity(orderDetailDTO)
                )
        );
    }

    @Override
    public OrderDetailDTO findById(Long id) {
        return mapper.toDTO(
                repo.findById(id).orElseThrow()
        );
    }

    @Override
    public List<OrderDetailDTO> findAll(Pageable pageable) {
        return mapper.toListDTO(repo.findAll(pageable).toList());
    }
}
