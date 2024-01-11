package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentWindowLinux implements Component {
    public ComponentWindowLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
