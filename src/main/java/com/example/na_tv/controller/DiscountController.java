package com.example.na_tv.controller;

import com.example.na_tv.models.DTO.DiscountDTO;
import com.example.na_tv.services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/discount")
public class DiscountController {
    @Autowired
    DiscountService service;

    @PostMapping("/save")
    DiscountDTO save (@RequestBody DiscountDTO dto) {
        return service.save(dto);
    }

    @GetMapping("/get")
    DiscountDTO findById(@RequestParam("id") Long id){
        return service.findById(id);
    }

    @GetMapping("/getAll")
    List<DiscountDTO> findAll(@RequestParam  int page, @RequestParam int size){
        return service.findAll(PageRequest.of(page, size));
    }
}
