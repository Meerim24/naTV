package com.example.na_tv.DAO;

import com.example.na_tv.models.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepo extends JpaRepository<OrderDetail,Long> {
}
