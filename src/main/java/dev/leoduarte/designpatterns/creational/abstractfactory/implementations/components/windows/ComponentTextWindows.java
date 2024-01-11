package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentTextWindows implements Component {
    public ComponentTextWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
