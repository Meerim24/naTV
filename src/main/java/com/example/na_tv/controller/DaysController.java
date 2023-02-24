package com.example.na_tv.controller;

import com.example.na_tv.models.DTO.DaysDTO;
import com.example.na_tv.services.DaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/days")
public class DaysController {
    @Autowired
    DaysService service;

    @PostMapping("/save")
    DaysDTO save (@RequestBody DaysDTO dto) {
        return service.save(dto);
    }

    @GetMapping("/get")
    DaysDTO findById(@RequestParam("id") Long id) { return service.findById(id); }
    @GetMapping("/getall")
    List<DaysDTO> findByAll(@RequestParam int page, @RequestParam int size ){
        return service.findAll(PageRequest.of(page, size));
    }
}
