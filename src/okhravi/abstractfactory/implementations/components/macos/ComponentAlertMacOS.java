package okhravi.abstractfactory.implementations.components.macos;

import okhravi.abstractfactory.interfaces.Component;

public class ComponentAlertMacOS implements Component {
    public ComponentAlertMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
