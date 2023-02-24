package com.example.na_tv.controller;

import com.example.na_tv.models.DTO.OrderDetailDTO;
import com.example.na_tv.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orderDetail")
public class OrderDetailController {
    @Autowired
    OrderDetailService service;

    @PostMapping("/save")
    OrderDetailDTO save(@RequestBody OrderDetailDTO dto){
        return service.save(dto);
    }

    @GetMapping("/get")
    OrderDetailDTO findById(@RequestParam("id") Long id){
        return service.findById(id);
    }

    @GetMapping("/getAll")
    List<OrderDetailDTO> findAll(@RequestParam  int page, @RequestParam int size){
        return service.findAll(PageRequest.of(page, size));
    }
}
