package com.projects.restaurantdesign.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Bill  extends BaseEntity{
    @OneToOne
    private OrderItems orderItems;
    @OneToMany
    private List<Payment> payments;
    @Enumerated(EnumType.ORDINAL)
    private OrderType orderType;
}
