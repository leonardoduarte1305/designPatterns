package dev.leoduarte.designpatterns.abstractfactory.implementations.components.windows;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentButtonWindows implements Component {
    public ComponentButtonWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
