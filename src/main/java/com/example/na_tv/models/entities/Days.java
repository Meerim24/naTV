package com.example.na_tv.models.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Days")
@Getter
@Setter
@RequiredArgsConstructor
public class Days {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "date_days")
    Date days;
    @ManyToOne
    @JoinColumn(name = "order_detail_id")
    OrderDetail orderDetail;

}
