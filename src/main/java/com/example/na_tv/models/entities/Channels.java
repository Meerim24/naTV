package com.example.na_tv.models.entities;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "channels")
public class Channels {
    @Id
    Long id;
    String name;
    Boolean active;
    Date addDate;
    int orderNumber;
    String photoPath;

}
