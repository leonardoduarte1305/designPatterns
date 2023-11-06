package dev.leoduarte.designpatterns.facade.implementations;

import dev.leoduarte.designpatterns.facade.interfaces.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.printf("Class: %s\n", this.getClass().getSimpleName());
    }
}
