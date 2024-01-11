package dev.leoduarte.designpatterns.creational.factory.implementations.factories;

import dev.leoduarte.designpatterns.creational.factory.abstractions.Product;
import dev.leoduarte.designpatterns.creational.factory.abstractions.ProductFactory;
import dev.leoduarte.designpatterns.creational.factory.implementations.products.Computer;
import dev.leoduarte.designpatterns.creational.factory.implementations.products.MobilePhone;
import dev.leoduarte.designpatterns.creational.factory.implementations.products.Tablet;

import java.util.UUID;

public class RandomProductFactory extends ProductFactory {
    @Override
    public Product factoryMethodCreateProduct() {
        long random = getRandom(100);

        if (random <= 33) {
            return new Computer(UUID.randomUUID(), "Mac Book Pro", 64);
        } else if (random <= 66) {
            return new MobilePhone(UUID.randomUUID(), "IIPhone 15 Pro", 10, 20);
        } else {
            return new Tablet(UUID.randomUUID(), "IPad 10 Pro", "Grey");
        }
    }

    private static long getRandom(int multiply) {
        return Math.round(Math.random() * multiply);
    }
}
