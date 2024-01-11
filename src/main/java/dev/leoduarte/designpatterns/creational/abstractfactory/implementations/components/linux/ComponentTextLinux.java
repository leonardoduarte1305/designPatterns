package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentTextLinux implements Component {
    public ComponentTextLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
