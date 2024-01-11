package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentButtonWindows implements Component {
    public ComponentButtonWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
