package com.nvrviews.structural.composite;

public class ExplorerWindow implements Window{
    @Override
    public void applyTheme(String theme) {
        System.out.println("Applied "+ theme +"to Explorer Window");
    }
}
