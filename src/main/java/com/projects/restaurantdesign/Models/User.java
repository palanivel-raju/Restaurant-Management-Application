package com.projects.restaurantdesign.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User extends BaseEntity{
    private String Name;
    private String email;
    private String phoneNo;
}
