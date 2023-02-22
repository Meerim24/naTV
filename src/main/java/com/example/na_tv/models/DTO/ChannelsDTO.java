package com.example.na_tv.models.DTO;



import lombok.*;

import java.util.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChannelsDTO {
    Long id;
    String name;
    Boolean active;
    Date addDate;
    int orderNumber;
    String photoPath;
}
