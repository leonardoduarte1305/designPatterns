package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.factories;

import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux.ComponentAlertLinux;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux.ComponentButtonLinux;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux.ComponentTextLinux;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux.ComponentWindowLinux;
import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;
import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.OperatingSystemComponentsFactory;

public class OperatingSystemComponentsFactoryForLinux implements OperatingSystemComponentsFactory {
    @Override
    public Component createComponentA() {
        return new ComponentAlertLinux();
    }

    @Override
    public Component createComponentB() {
        return new ComponentButtonLinux();
    }

    @Override
    public Component createComponentC() {
        return new ComponentTextLinux();
    }

    @Override
    public Component createComponentD() {
        return new ComponentWindowLinux();
    }
}
