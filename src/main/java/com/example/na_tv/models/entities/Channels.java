package com.example.na_tv.models.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "channels")
@Getter
@Setter
@RequiredArgsConstructor
public class Channels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Boolean active;
    Date addDate;
    int orderNumber;
    String photoPath;

}
