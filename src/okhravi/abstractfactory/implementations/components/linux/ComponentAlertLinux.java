package okhravi.abstractfactory.implementations.components.linux;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentAlertLinux implements Component {
    public ComponentAlertLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
