package okhravi.abstractfactory.implementations.components.linux;

import okhravi.abstractfactory.interfaces.Component;

public class ComponentWindowLinux implements Component {
    public ComponentWindowLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
