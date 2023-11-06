package dev.leoduarte.designpatterns.factory.implementations.products;

import dev.leoduarte.designpatterns.factory.abstractions.Product;

import java.util.UUID;

public class Tablet extends Product {
    private final String color;

    public Tablet(UUID uuid, String name, String color) {
        super(uuid, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
