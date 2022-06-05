package com.nvrviews.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class ApplyThemeToAll implements Window{

    List<Window> windows = new ArrayList<>();

    public void addWindow(Window w){
        windows.add(w);
    }

    public void removeWindow(Window w){
        windows.remove(w);
    }

    @Override
    public void applyTheme(String theme) {
        windows.forEach(window -> window.applyTheme(theme));
    }
}
