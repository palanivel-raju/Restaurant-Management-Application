package com.projects.restaurantdesign.Decorater.Addon;

import com.projects.restaurantdesign.Decorater.Meals;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SouthIndian implements Addon{
    Meals meals;
    private int cost;
    public SouthIndian(Meals meals){
        this.meals = meals;
    }
    @Override
    public int itemCost() {
        return meals.itemCost()+ getCost();
    }
}
