package okhravi.abstractfactory.implementations.components.linux;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentTextLinux implements Component {
    public ComponentTextLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}