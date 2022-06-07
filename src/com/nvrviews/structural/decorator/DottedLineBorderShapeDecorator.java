package com.nvrviews.structural.decorator;

public class DottedLineBorderShapeDecorator extends ShapeDecorator{

    public DottedLineBorderShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("  -with dotted line border");
    }
}
