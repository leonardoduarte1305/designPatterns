package okhravi.abstractfactory.implementations.components.windows;

import okhravi.abstractfactory.abstractions.Component;

public class ComponentWindowWindows implements Component {
    public ComponentWindowWindows() {
        System.out.println(this.getClass().getSimpleName() + " -> Created");
    }
}
