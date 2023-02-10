package com.example.na_tv.models.entities;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Days")
public class Days {
    @Id
    Long id;
    @Column(name = "date_days")
    Date days;
    @ManyToOne
    @JoinColumn(name = "order_detail_id")
    OrderDetail orderDetail;

}
