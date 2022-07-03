package com.nvrviews.behavioural.iterator;

public class StringIterator implements Iterator<String>{

    private StringContainer cont;

    private int index = 0;

    public StringIterator(StringContainer stringContainer) {
        this.cont = stringContainer;
    }

    @Override
    public boolean hasNext() {
        if(index < this.cont.getName().size()){
            return true;
        }
        return false;
    }

    @Override
    public String next() {
        String e = this.cont.getName().get(index);
        index++;
        return e;
    }
}
