package com.example.na_tv.DAO;

import com.example.na_tv.models.entities.Channels;
import com.example.na_tv.models.entities.Days;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaysRepo extends JpaRepository<Days,Long> {

}