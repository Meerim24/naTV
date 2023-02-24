package com.example.na_tv.models.DTO;



import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("add_date")
    Date addDate;
    @JsonProperty("order_num")
    int orderNumber;
    @JsonProperty("photo_path")
    String photoPath;
}
