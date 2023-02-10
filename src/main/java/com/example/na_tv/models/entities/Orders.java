package com.example.na_tv.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    Long id;
    @Column(name = "full_name")
    String name;
    String email;
    String phoneNum;
    String text;
    Double totalPrice;
}
