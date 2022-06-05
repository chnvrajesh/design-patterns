package com.nvrviews.structural.adapter;

public class Pentagon implements NewShape{

    @Override
    public void drawShape() {
        System.out.println("Drawing pentagon");
    }

    @Override
    public void resize() {
        System.out.println("Resizing Pentagon");
    }
}
