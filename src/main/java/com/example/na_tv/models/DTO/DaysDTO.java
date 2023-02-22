package com.example.na_tv.models.DTO;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DaysDTO {
    Long id;

    Date days;

    OrderDetailDTO orderDetail;
}
