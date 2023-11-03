package okhravi.abstractfactory.implementations.components.macos;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentTextMacOS implements Component {
    public ComponentTextMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
