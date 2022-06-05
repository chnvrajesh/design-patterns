package com.nvrviews.structural.adapter;

/**
 *  1. Used to enable TWO incompatible interfaces to work smoothly each other
 *  2. The Object that is used to join these 2 interfaces is called as ADAPTER
 *  3. Adapter will convert one type of interface to another
 *  4. Adapter patter is also called as WRAPPER PATTERN
 *  5. This is used when an existing component has to be used with new logic
 *  6. Target, Adapter, Adaptee and Client are the specification in Adapter Pattern
 *  7. Create Shape and NewShape are 2 incompatible interfaces
 *  8. create a class to draw all the shapes with methods addShape(s) and drawShapes() which are
 *      compatible with Shape interface. This class is incompatible to handle NewShape
 *  9. Create NewShapeAdapter class, which will implement Shape interface and references NewShape
 *  10. This NewShapeAdapter is compatible to draw all shapes class
 */

public class AdapterPatternDemo {
    public static void main(String[] args) {
        DrawShapes drawShapes = new DrawShapes();

        drawShapes.addShape(new Triangle());
        drawShapes.addShape(new Square());
        drawShapes.addShape(new NewShapeAdapter(new Pentagon()));

        drawShapes.drawShape();
    }
}
