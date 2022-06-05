package com.nvrviews.structural.bridge;

public class Square extends  Shape{

    public Square(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.println("Square filled with ");
        color.fillColor();
    }
}
