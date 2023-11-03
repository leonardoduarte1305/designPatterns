package okhravi.abstractfactory.implementations.components.linux;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentButtonLinux implements Component {
    public ComponentButtonLinux() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
