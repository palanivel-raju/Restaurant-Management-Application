package com.projects.restaurantdesign.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Branch extends BaseEntity{
    private String branchName;
    @OneToOne
    private Menu menu;
    private String location;
    @ManyToOne
    private Restaurant restaurantGroup;
}
