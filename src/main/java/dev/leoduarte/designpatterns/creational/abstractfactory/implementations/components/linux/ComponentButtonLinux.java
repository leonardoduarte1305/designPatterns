package dev.leoduarte.designpatterns.creational.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.creational.abstractfactory.interfaces.Component;

public class ComponentButtonLinux implements Component {
    public ComponentButtonLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
