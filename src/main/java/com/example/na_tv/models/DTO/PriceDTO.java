package com.example.na_tv.models.DTO;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PriceDTO {
    Long id;
    boolean active;
    Date startDate;
    Date endDate;
    Double price;
    ChannelsDTO channels;
}
