package okhravi.facade;

import okhravi.facade.implementations.ShapeMaker;
import okhravi.facade.interfaces.Shape;

public class FacadeTest {
    public static void main(String[] args) {
        // The facade ShapeMaker allows us to easy interact with the shapes
        ShapeMaker shapeMaker = new ShapeMaker();

        // It's possible to draw shapes
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

        // Or even get complete instances of shapes
        Shape circle = shapeMaker.getCircle();
        Shape rectangle = shapeMaker.getRectangle();
        Shape square = shapeMaker.getSquare();
    }
}
