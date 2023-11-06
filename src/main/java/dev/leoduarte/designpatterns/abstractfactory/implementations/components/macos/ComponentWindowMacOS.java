package dev.leoduarte.designpatterns.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentWindowMacOS implements Component {
    public ComponentWindowMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
