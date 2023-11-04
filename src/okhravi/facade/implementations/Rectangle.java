package okhravi.facade.implementations;

import okhravi.facade.interfaces.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.printf("Class: %s\n", this.getClass().getSimpleName());
    }
}
