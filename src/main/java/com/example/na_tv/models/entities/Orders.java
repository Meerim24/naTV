package com.example.na_tv.models.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orders")
@Getter
@Setter
@RequiredArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "full_name")
    String name;
    String email;
    String phoneNum;
    String text;
    Double totalPrice;
}
