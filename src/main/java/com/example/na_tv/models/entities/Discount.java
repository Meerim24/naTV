package com.example.na_tv.models.entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity(name = "Discount")
@Getter
@Setter
@RequiredArgsConstructor
public class Discount {
    @Id
    Long id;
    Date startDate;
    Date endDate;
    int minDate;
    int present;
    @ManyToOne
    @JoinColumn(name = "channel_id")
    Channels channels;
}
