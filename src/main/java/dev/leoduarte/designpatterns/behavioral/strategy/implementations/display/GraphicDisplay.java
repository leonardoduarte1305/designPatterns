package dev.leoduarte.designpatterns.behavioral.strategy.implementations.display;

import dev.leoduarte.designpatterns.behavioral.strategy.interfaces.Display;

public class GraphicDisplay implements Display {
    @Override
    public void runDisplay() {
        System.out.println("Graphic display!");
    }
}
