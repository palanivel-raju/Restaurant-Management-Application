package com.projects.restaurantdesign.Decorater;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VegMeals implements Meals{
    private int cost;

    @Override
    public int itemCost() {
        return getCost();
    }
}
