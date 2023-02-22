package com.example.na_tv.services;

import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService <D>{
    D save(D t);
    D findById(Long id);
    List<D> findAll(Pageable pageable);
}
