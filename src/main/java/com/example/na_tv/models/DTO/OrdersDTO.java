package com.example.na_tv.models.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrdersDTO {
    String name;
    String email;
    String phoneNum;
    String text;
    Double totalPrice;
}
