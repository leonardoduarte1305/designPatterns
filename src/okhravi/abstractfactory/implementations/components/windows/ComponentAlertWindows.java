package okhravi.abstractfactory.implementations.components.windows;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentAlertWindows implements Component {
    public ComponentAlertWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
