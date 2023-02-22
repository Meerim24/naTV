package com.example.na_tv.services.impl;

import com.example.na_tv.DAO.OrdersRepo;
import com.example.na_tv.mapper.OrdersMapper;
import com.example.na_tv.models.DTO.OrdersDTO;
import com.example.na_tv.services.OrdersService;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper mapper;
    @Autowired
    OrdersRepo repo;
    @Override
    public OrdersDTO save(OrdersDTO ordersDTO) {
        return mapper.toDTO(
                repo.save(
                        mapper.toEntity(ordersDTO)
                )
        );
    }

    @Override
    public OrdersDTO findById(Long id) {
        return mapper.toDTO(
                repo.findById(id).orElseThrow()
        );
    }

    @Override
    public List<OrdersDTO> findAll(Pageable pageable) {
        return mapper.toListDTO(repo.findAll(pageable).toList());
    }
}
