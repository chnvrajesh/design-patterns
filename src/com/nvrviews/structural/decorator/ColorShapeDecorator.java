package com.nvrviews.structural.decorator;

public class ColorShapeDecorator extends ShapeDecorator{
    private String color;

    public ColorShapeDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        super.draw();
        drawBorder();
    }

    private void drawBorder(){
        System.out.println("  -with " +this.color + " border");
    }
}
