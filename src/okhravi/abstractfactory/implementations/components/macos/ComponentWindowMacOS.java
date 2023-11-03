package okhravi.abstractfactory.implementations.components.macos;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentWindowMacOS implements Component {
    public ComponentWindowMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
