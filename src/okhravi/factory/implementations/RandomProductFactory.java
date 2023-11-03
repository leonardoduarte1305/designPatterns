package okhravi.factory.implementations;

import okhravi.factory.abstractions.Product;
import okhravi.factory.abstractions.ProductFactory;

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
