package okhravi.abstractfactory.implementations.components.macos;

import okhravi.abstractfactory.interfaces.Component;

public class ComponentTextMacOS implements Component {
    public ComponentTextMacOS() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
