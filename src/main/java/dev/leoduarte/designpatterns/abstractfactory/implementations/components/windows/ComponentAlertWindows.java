package dev.leoduarte.designpatterns.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentAlertWindows implements Component {
    public ComponentAlertWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
