package dev.leoduarte.designpatterns.creational.factory.implementations.products;

import dev.leoduarte.designpatterns.creational.factory.abstractions.Product;

import java.util.UUID;

public class Computer extends Product {
    private final int ramMem;

    public Computer(UUID uuid, String name, int ramMem) {
        super(uuid, name);
        this.ramMem = ramMem;
    }

    public int getRamMem() {
        return ramMem;
    }
}
