package dev.leoduarte.designpatterns.factory.implementations.factories;

import dev.leoduarte.designpatterns.factory.abstractions.Product;
import dev.leoduarte.designpatterns.factory.abstractions.ProductFactory;
import dev.leoduarte.designpatterns.factory.implementations.products.Computer;
import dev.leoduarte.designpatterns.factory.implementations.products.MobilePhone;
import dev.leoduarte.designpatterns.factory.implementations.products.Tablet;

import java.util.UUID;

public class BalancedProductFactory extends ProductFactory {
    private Product actualProduct;

    @Override
    public Product factoryMethodCreateProduct() {

        if (actualProduct == null || actualProduct instanceof Tablet) {
            actualProduct = new Computer(UUID.randomUUID(), "Mac Book Pro", 64);
            return actualProduct;
        }

        if (actualProduct instanceof Computer) {
            actualProduct = new MobilePhone(UUID.randomUUID(), "IIPhone 15 Pro", 10, 20);
            return actualProduct;
        }

        if (actualProduct instanceof MobilePhone) {
            actualProduct = new Tablet(UUID.randomUUID(), "IPad 10 Pro", "Grey");
            return actualProduct;
        }

        return null;
    }
}
