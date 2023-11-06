package dev.leoduarte.designpatterns.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentTextWindows implements Component {
    public ComponentTextWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
