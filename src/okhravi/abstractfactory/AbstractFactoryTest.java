package okhravi.abstractfactory;

import okhravi.abstractfactory.abstractions.OperatingSystemComponentsFactory;
import okhravi.abstractfactory.implementations.factories.OperatingSystemComponentsFactoryForLinux;
import okhravi.abstractfactory.implementations.factories.OperatingSystemComponentsFactoryForMacOS;
import okhravi.abstractfactory.implementations.factories.OperatingSystemComponentsFactoryForWindows;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        // Declaring the Factory
        OperatingSystemComponentsFactory componentsFactory;

        // Testing the factory with different implementations
        // It's able to produce different but related objects depending on the factory implementation
        componentsFactory = new OperatingSystemComponentsFactoryForLinux();
        componentsFactory.createComponentA();
        componentsFactory.createComponentB();
        componentsFactory.createComponentC();
        componentsFactory.createComponentD();

        System.out.println("============================================");
        componentsFactory = new OperatingSystemComponentsFactoryForMacOS();
        componentsFactory.createComponentA();
        componentsFactory.createComponentB();
        componentsFactory.createComponentC();
        componentsFactory.createComponentD();

        System.out.println("============================================");
        componentsFactory = new OperatingSystemComponentsFactoryForWindows();
        componentsFactory.createComponentA();
        componentsFactory.createComponentB();
        componentsFactory.createComponentC();
        componentsFactory.createComponentD();
    }
}
