package com.nvrviews.structural.bridge;

public class Tiangle extends  Shape{

    public Tiangle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.println("Triangle filled with ");
        color.fillColor();
    }
}
