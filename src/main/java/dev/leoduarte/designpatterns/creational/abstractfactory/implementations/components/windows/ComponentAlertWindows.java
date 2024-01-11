package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentAlertWindows implements Component {
    public ComponentAlertWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
