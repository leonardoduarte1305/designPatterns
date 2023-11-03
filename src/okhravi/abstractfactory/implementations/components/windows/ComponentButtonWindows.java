package okhravi.abstractfactory.implementations.components.windows;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentButtonWindows implements Component {
    public ComponentButtonWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
