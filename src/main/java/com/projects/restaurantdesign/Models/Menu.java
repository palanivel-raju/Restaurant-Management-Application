package com.projects.restaurantdesign.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Menu extends BaseEntity{
    @ManyToMany
    private List<MenuSection> menuSections;
}
