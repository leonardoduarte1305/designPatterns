package dev.leoduarte.designpatterns.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentWindowWindows implements Component {
    public ComponentWindowWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
