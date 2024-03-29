package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.factories;

import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows.ComponentAlertWindows;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows.ComponentButtonWindows;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows.ComponentTextWindows;
import dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows.ComponentWindowWindows;
import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;
import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.OperatingSystemComponentsFactory;

public class OperatingSystemComponentsFactoryForWindows implements OperatingSystemComponentsFactory {
    @Override
    public Component createComponentA() {
        return new ComponentAlertWindows();
    }

    @Override
    public Component createComponentB() {
        return new ComponentButtonWindows();
    }

    @Override
    public Component createComponentC() {
        return new ComponentTextWindows();
    }

    @Override
    public Component createComponentD() {
        return new ComponentWindowWindows();
    }
}
