package com.nvrviews.structural.decorator;

public abstract class ShapeDecorator implements Shape{

    private Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        this.decoratedShape.draw();
    }
}
