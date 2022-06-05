package com.nvrviews.structural.composite;

/**
 *  1. We can use it when we need to treat all the object in the structure as same. Ex: apply theme
 *  
 */

public class CompositePatternDemo {
    public static void main(String[] args) {
        ApplyThemeToAll ata = new ApplyThemeToAll();

        ata.addWindow(new ExplorerWindow());
        ata.addWindow(new PropertiesWindow());

        ata.applyTheme("DARK Theme");
    }
}
