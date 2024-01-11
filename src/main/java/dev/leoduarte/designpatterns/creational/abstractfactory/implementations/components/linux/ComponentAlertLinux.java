package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentAlertLinux implements Component {
    public ComponentAlertLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
