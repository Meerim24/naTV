package com.example.na_tv.models.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price")
@Getter
@Setter
@RequiredArgsConstructor
public class Price {
    @Id
    Long id;
    boolean active;
    Date startDate;
    Date endDate;
    Double price;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    Channels channels;
}
