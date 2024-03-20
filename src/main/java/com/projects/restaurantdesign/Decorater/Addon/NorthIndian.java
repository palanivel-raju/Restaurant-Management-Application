package com.projects.restaurantdesign.Decorater.Addon;


import com.projects.restaurantdesign.Decorater.Meals;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NorthIndian implements Addon{
    Meals meals;
    private int cost;
    public NorthIndian(Meals meals){
        this.meals = meals;
    }
    @Override
    public int itemCost() {
        return meals.itemCost()+ getCost();
    }
}