package okhravi.abstractfactory.implementations.components.macos;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentButtonMacOS implements Component {
    public ComponentButtonMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
