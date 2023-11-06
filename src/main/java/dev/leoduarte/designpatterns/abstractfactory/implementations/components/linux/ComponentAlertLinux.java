package dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentAlertLinux implements Component {
    public ComponentAlertLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
