package dev.leoduarte.designpatterns.abstractfactory.implementations.components.linux;

import dev.leoduarte.designpatterns.abstractfactory.interfaces.Component;

public class ComponentButtonLinux implements Component {
    public ComponentButtonLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
