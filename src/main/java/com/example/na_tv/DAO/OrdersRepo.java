package com.example.na_tv.DAO;

import com.example.na_tv.models.entities.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepo extends JpaRepository<Orders,Long> {
}
