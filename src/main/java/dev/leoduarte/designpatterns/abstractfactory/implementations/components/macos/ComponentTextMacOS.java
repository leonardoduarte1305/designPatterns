package dev.leoduarte.designpatterns.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentTextMacOS implements Component {
    public ComponentTextMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
