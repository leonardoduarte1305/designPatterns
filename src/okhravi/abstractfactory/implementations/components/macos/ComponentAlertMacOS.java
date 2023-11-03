package okhravi.abstractfactory.implementations.components.macos;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentAlertMacOS implements Component {
    public ComponentAlertMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
