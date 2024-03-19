package com.projects.restaurantdesign.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Restaurant extends BaseEntity {
    @OneToMany
    private List<Branch> branches;
    private String restaurantName;
}
