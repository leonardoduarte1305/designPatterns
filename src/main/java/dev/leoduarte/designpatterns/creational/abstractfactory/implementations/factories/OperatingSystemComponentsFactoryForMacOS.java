package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.factories;

import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos.ComponentAlertMacOS;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos.ComponentButtonMacOS;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos.ComponentTextMacOS;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos.ComponentWindowMacOS;
import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;
import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.OperatingSystemComponentsFactory;

public class OperatingSystemComponentsFactoryForMacOS implements OperatingSystemComponentsFactory {
    @Override
    public Component createComponentA() {
        return new ComponentAlertMacOS();
    }

    @Override
    public Component createComponentB() {
        return new ComponentButtonMacOS();
    }

    @Override
    public Component createComponentC() {
        return new ComponentTextMacOS();
    }

    @Override
    public Component createComponentD() {
        return new ComponentWindowMacOS();
    }
}
