package com.projects.restaurantdesign.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class MenuItem extends BaseEntity {
    private String name;
    private int price;
}
