package okhravi.strategy.implementations.display;

import okhravi.strategy.interfaces.Display;

public class TextDisplay implements Display {
    @Override
    public void runDisplay() {
        System.out.println("Text display!");
    }
}
