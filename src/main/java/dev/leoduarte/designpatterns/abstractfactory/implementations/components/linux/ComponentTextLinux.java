package dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentTextLinux implements Component {
    public ComponentTextLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
