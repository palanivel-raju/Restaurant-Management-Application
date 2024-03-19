package com.projects.restaurantdesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RestaurantDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantDesignApplication.class, args);
    }

}
