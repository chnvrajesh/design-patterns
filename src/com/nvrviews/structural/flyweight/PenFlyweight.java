package com.nvrviews.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PenFlyweight {

    private Map<String, Pen> penPool = new HashMap<>();

    public Pen getPen(BrushSize brushSize, String color){
        Pen p = null;

        p = penPool.get(color + "-" + brushSize);
        if (p == null){
            switch(brushSize.toString()){
                case "THICK":
                    p = new ThickPen();
                    break;

                case "THIN":
                    p = new ThinPen();
                    break;
                case "MEDIUM":
                    p = new MediumPen();
                    break;
                default:
            }

            p.setColor(color);

            penPool.put(color + "-" + brushSize, p );
        }

        return p;
    }
}
