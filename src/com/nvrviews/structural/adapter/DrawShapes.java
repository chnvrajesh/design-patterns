package com.nvrviews.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DrawShapes {
    List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape s ){
        shapes.add(s);
    }

    public void drawShape(){
        if (shapes != null && shapes.isEmpty() == false){
            shapes.forEach(Shape::draw);
        }
    }

}
