package com.projects.restaurantdesign.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class MenuSection extends BaseEntity{
    private String menuSections;
    @ManyToMany
    private List<MenuItem> menuItems;
}
