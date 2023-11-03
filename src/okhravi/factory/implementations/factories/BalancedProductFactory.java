package okhravi.factory.implementations.factories;

import okhravi.factory.abstractions.Product;
import okhravi.factory.abstractions.ProductFactory;
import okhravi.factory.implementations.products.Computer;
import okhravi.factory.implementations.products.MobilePhone;
import okhravi.factory.implementations.products.Tablet;

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
