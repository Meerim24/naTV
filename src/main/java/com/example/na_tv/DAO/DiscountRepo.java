package com.example.na_tv.DAO;

import com.example.na_tv.models.entities.Channels;
import com.example.na_tv.models.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountRepo extends JpaRepository<Discount,Long> {
}
