package com.projects.restaurantdesign.Decorater;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NonVegMeals implements Meals{
    private int cost;

    @Override
    public int itemCost() {
        return getCost();
    }
}
