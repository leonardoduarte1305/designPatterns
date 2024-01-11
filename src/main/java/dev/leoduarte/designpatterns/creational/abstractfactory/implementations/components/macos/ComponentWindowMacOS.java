package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentWindowMacOS implements Component {
    public ComponentWindowMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
