package com.nvrviews.behavioural.Memento;

import java.util.ArrayList;
import java.util.List;

public class StateController {
    private List<Memento> mementos = new ArrayList<>();

    public void add(Memento m){
        mementos.add(m);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
