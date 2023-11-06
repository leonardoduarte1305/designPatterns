package dev.leoduarte.designpatterns.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentButtonMacOS implements Component {
    public ComponentButtonMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
