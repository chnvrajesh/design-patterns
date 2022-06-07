package com.nvrviews.structural.decorator;

public class Triangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}
