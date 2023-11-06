package dev.leoduarte.designpatterns.strategy.implementations.display;

import dev.leoduarte.designpatterns.strategy.interfaces.Display;

public class TextDisplay implements Display {
    @Override
    public void runDisplay() {
        System.out.println("Text display!");
    }
}
