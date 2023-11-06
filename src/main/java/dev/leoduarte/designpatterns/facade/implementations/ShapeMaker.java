package dev.leoduarte.designpatterns.facade.implementations;

import dev.leoduarte.designpatterns.facade.interfaces.Shape;

public class ShapeMaker {
    private final Shape circle;
    private final Shape rectangle;
    private final Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public Shape getCircle() {
        return circle;
    }

    public Shape getRectangle() {
        return rectangle;
    }

    public Shape getSquare() {
        return square;
    }
}
