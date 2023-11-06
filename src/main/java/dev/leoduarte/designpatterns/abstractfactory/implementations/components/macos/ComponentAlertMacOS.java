package dev.leoduarte.designpatterns.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentAlertMacOS implements Component {
    public ComponentAlertMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
