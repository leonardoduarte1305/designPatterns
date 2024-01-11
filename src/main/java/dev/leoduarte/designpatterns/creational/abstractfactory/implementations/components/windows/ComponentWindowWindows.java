package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentWindowWindows implements Component {
    public ComponentWindowWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
