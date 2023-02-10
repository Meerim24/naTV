package com.example.na_tv.models.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_detail")
public class OrderDetail {
    @Id
    Long id;
    double price;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    Channels channels;
    @ManyToOne
    @JoinColumn(name = "orders_id")
    Orders orders;
}
