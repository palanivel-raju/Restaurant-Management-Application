package com.projects.restaurantdesign.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class DineInOrder extends OrderItems{
    @ManyToOne
    private DinningTable table;
    private int noOfOccupancy;
}
