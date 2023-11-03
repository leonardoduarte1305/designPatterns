package okhravi.abstractfactory.implementations.components.linux;

import okhravi.abstractfactory.interfaces.Component;

public class ComponentButtonLinux implements Component {
    public ComponentButtonLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
