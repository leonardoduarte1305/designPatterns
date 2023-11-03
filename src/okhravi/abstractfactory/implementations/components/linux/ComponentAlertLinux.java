package okhravi.abstractfactory.implementations.components.linux;

import okhravi.abstractfactory.interfaces.Component;

public class ComponentAlertLinux implements Component {
    public ComponentAlertLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
