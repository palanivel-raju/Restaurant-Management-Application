package com.projects.restaurantdesign.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class OrderItems extends BaseEntity {
    @OneToMany
    private List<MenuItem> orderList;
    private int totalAmt;
    @Enumerated(EnumType.ORDINAL)
    private OrderType orderType;

}
