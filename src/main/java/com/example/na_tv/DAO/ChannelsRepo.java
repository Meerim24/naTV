package com.example.na_tv.DAO;

import com.example.na_tv.models.entities.Channels;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChannelsRepo extends JpaRepository<Channels,Long> {

}
