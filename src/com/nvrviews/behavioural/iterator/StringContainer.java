package com.nvrviews.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class StringContainer implements Container<String>{

    List<String> names = new ArrayList<>();

    @Override
    public Iterator<String> getIterator() {
        return new StringIterator(this);
    }

    public void add(String s){
        names.add(s);
    }

    public List<String> getName(){
        return names;
    }
}
