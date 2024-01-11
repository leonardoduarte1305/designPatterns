package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentButtonMacOS implements Component {
    public ComponentButtonMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
