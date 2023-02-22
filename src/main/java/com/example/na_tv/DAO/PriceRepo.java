package com.example.na_tv.DAO;

import com.example.na_tv.models.entities.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepo extends JpaRepository<Price,Long> {
}
