package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentTextMacOS implements Component {
    public ComponentTextMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
