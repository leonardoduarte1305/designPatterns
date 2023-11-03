package okhravi.abstractfactory.implementations.components.linux;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentWindowLinux implements Component {
    public ComponentWindowLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
