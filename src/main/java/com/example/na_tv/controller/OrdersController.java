package com.example.na_tv.controller;

import com.example.na_tv.models.DTO.OrdersDTO;
import com.example.na_tv.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
    @Autowired
    OrdersService service;

    @PostMapping("/save")
    OrdersDTO save(@RequestBody OrdersDTO dto) {
        return service.save(dto);
    }

    @GetMapping("/get")
    OrdersDTO findById(@RequestParam("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("/getAll")
    List<OrdersDTO> findAll(@RequestParam int page, @RequestParam int size) {
        return service.findAll(PageRequest.of(page, size));
    }
}
