package com.example.na_tv.models.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "price")
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
