package com.nvrviews.structural.composite;

public class PropertiesWindow implements Window{
    @Override
    public void applyTheme(String theme) {
        System.out.println("Applied "+ theme +"to Properties Window");
    }
}
