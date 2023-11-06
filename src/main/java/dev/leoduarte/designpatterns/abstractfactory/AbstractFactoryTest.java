package dev.leoduarte.designpatterns.abstractfactory;

import dev.leoduarte.designpatterns.abstractfactory.implementations.factories.OperatingSystemComponentsFactoryForLinux;
import dev.leoduarte.designpatterns.abstractfactory.implementations.factories.OperatingSystemComponentsFactoryForMacOS;
import dev.leoduarte.designpatterns.abstractfactory.implementations.factories.OperatingSystemComponentsFactoryForWindows;
import dev.leoduarte.designpatterns.abstractfactory.interfaces.OperatingSystemComponentsFactory;

public class AbstractFactoryTest {

    // Youtube Video
    // https://youtu.be/v-GiuMmsXj4?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
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
