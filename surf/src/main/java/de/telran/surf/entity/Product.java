package de.telran.surf.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Product {

    private String id;

    private String name;

    private double price;

    private double oldPrice;

    private boolean isNew;

    private boolean isHot;

    private String description;

    private String picture;

    public Product() {
        this.id = UUID.randomUUID().toString();
    }
}
