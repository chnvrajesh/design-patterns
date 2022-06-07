package com.nvrviews.structural.decorator;

/**
 *  1. Used to add additional features or behaviours to the particular instance of a class ,
 *      while leaving other instances as is
 *  2. Define interface for component type
 *  3. Create components by implementing the interface
 *  4. Create decorator abstraction by implementing the interface
 *  5. Create concrete decorators by extending the decorator abstraction and define the additional specifications
 */

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new ColorShapeDecorator(new Circle(), "RED");
        redCircle.draw();

        Shape dottedTriangle = new DottedLineBorderShapeDecorator(new Triangle());
        dottedTriangle.draw();

    }
}
