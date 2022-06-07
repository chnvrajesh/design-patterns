package com.nvrviews.structural.flyweight;

/**
 *  1. Used when we need to reuse already existing similar kind of objects by storing them
 *      and create new object when no matching object is found
 */

public class FlyweightPatternDemo {
    public static void main(String[] args) {
        PenFlyweight penFlyweight = new PenFlyweight();

        Pen p1 = penFlyweight.getPen(BrushSize.THICK, "RED");
        Pen p2 = penFlyweight.getPen(BrushSize.THIN, "GREEN");
        Pen p3 = penFlyweight.getPen(BrushSize.THIN, "GREEN");

        p1.write("I am P1");
        p2.write("I am P2");
        p3.write("I am P3");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
