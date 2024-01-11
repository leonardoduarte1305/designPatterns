package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.macos;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentAlertMacOS implements Component {
    public ComponentAlertMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
