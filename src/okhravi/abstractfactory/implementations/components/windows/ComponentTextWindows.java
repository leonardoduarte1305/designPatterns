package okhravi.abstractfactory.implementations.components.windows;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentTextWindows implements Component {
    public ComponentTextWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
