package com.example.na_tv.models.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderDetailDTO {
    Long id;
    double price;
    ChannelsDTO channels;

    OrdersDTO orders;
}
