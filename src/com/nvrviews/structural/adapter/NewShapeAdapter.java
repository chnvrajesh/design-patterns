package com.nvrviews.structural.adapter;

public class NewShapeAdapter implements Shape{

    private NewShape newShape;

    public NewShapeAdapter(NewShape newShape) {
        this.newShape = newShape;
    }

    @Override
    public void draw() {
        newShape.drawShape();
    }
}
