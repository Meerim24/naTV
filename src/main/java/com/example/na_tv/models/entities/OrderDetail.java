package com.example.na_tv.models.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@RequiredArgsConstructor
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    double price;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    Channels channels;
    @ManyToOne
    @JoinColumn(name = "orders_id")
    Orders orders;
}
