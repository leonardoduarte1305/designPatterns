package okhravi.factory;

import okhravi.factory.abstractions.Product;
import okhravi.factory.abstractions.ProductFactory;
import okhravi.factory.implementations.factories.BalancedProductFactory;
import okhravi.factory.implementations.factories.RandomProductFactory;
import okhravi.factory.implementations.products.Computer;
import okhravi.factory.implementations.products.MobilePhone;
import okhravi.factory.implementations.products.Tablet;

public class FactoryMethodTest {

    // Youtube Video
    // https://youtu.be/EcFVTgRHJLM?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
    static int computer = 0;
    static int mobilePhone = 0;
    static int tablet = 0;

    public static void main(String[] args) {
        ProductFactory productFactory;

        // Using the RandomFactory to generate products
        productFactory = new RandomProductFactory();
        // Generate N products "randomly"
        generatingProductsRandomly(productFactory, 201);


        resettingCounters();

        // Using the BalancedFactory to generate products
        productFactory = new BalancedProductFactory();
        // Generating products "balanced"
        generatingProductsBalanced(productFactory, 201);
    }

    private static void resettingCounters() {
        computer = 0;
        mobilePhone = 0;
        tablet = 0;
    }

    private static void generatingProductsRandomly(ProductFactory productFactory, int quantity) {


        for (int geraNProdutos = 0; geraNProdutos < quantity; geraNProdutos++) {
            Product product = productFactory.factoryMethodCreateProduct();

            if (product instanceof Computer) computer++;
            if (product instanceof MobilePhone) mobilePhone++;
            if (product instanceof Tablet) tablet++;
        }

        printProductCount("Computers: %d\nMobilePhones: %d\nTablets: %d\n\n");
    }

    private static void generatingProductsBalanced(ProductFactory productFactory, int quantity) {

        for (int geraNProdutos = 0; geraNProdutos < quantity; geraNProdutos++) {
            Product product = productFactory.factoryMethodCreateProduct();

            if (product instanceof Computer) computer++;
            if (product instanceof MobilePhone) mobilePhone++;
            if (product instanceof Tablet) tablet++;
        }

        printProductCount("Computers: %d\nMobilePhones: %d\nTablets: %d\n");
    }

    private static void printProductCount(String format) {
        System.out.printf(format, computer, mobilePhone, tablet);
    }
}
