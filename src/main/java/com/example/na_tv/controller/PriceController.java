package com.example.na_tv.controller;

import com.example.na_tv.models.DTO.PriceDTO;
import com.example.na_tv.services.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController {
    @Autowired
    PriceService service;

    @PostMapping("/save")
    PriceDTO save(@RequestBody PriceDTO dto){
        return service.save(dto);
    }

    @GetMapping("/get")
    PriceDTO findById(@RequestParam("id") Long id){
        return service.findById(id);
    }

    @GetMapping("/getAll")
    List<PriceDTO> findAll(@RequestParam  int page, @RequestParam int size){
        return service.findAll(PageRequest.of(page, size));
    }
}
