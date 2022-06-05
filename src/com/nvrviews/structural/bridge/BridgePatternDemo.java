package com.nvrviews.structural.bridge;

/**
 *  1. Used to decouple the interfaces (abstraction) from its implementation and hiding the
 *      implementation details from client
 *  2.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape triangle = new Tiangle(new RedColor());
        triangle.fillColor();

        Shape square = new Square(new GreenColor());
        square.fillColor();
    }
}
