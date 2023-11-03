package okhravi.abstractfactory.implementations.components.windows;

import okhravi.abstractfactory.interfaces.Component;

public class ComponentTextWindows implements Component {
    public ComponentTextWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
