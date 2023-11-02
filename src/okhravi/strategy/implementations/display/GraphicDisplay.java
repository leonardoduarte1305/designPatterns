package okhravi.strategy.implementations.display;

import okhravi.strategy.interfaces.Display;

public class GraphicDisplay implements Display {
    @Override
    public void runDisplay() {
        System.out.println("Graphic display!");
    }
}
