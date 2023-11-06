package dev.leoduarte.designpatterns.factory.abstractions;

import java.util.UUID;

public abstract class Product {
    protected UUID uuid;
    protected String name;

    public Product(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }
}
