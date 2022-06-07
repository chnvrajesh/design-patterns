package com.nvrviews.structural.flyweight;

public class ThickPen implements Pen{

    final BrushSize brushSize = BrushSize.THICK;
    private String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public BrushSize getBrushSize() {
        return brushSize;
    }

    @Override
    public void write(String text) {
        System.out.println(text + " with " + brushSize);
    }
}
