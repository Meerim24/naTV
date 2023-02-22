package com.example.na_tv.models.DTO;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DiscountDTO {

    Long id;
    Date startDate;
    Date endDate;
    int minDate;
    int present;
    ChannelsDTO channels;
}
