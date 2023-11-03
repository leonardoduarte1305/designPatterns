package okhravi.abstractfactory.implementations.components.windows;

import okhravi.abstractfactory.interfaces.Component;

public class ComponentButtonWindows implements Component {
    public ComponentButtonWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
