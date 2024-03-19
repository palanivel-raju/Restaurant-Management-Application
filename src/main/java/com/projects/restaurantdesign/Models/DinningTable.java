package com.projects.restaurantdesign.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "dinning_table")
@Getter
@Setter
public class DinningTable extends BaseEntity{
    private int capactiy;
    private int tableNo;
    private boolean reserved;
    private String seatingArrangement;
}
