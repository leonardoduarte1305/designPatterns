package dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentWindowLinux implements Component {
    public ComponentWindowLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
