package dev.leoduarte.designpatterns.abstractfactory.implementations.factories;

import dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux.ComponentAlertLinux;
import dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux.ComponentButtonLinux;
import dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux.ComponentTextLinux;
import dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux.ComponentWindowLinux;
import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;
import dev.leoduarte.designpatterns.abstractfactory.interfaces.OperatingSystemComponentsFactory;

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
