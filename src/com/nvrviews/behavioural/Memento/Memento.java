package com.nvrviews.behavioural.Memento;

public class Memento<T> {
    private T object;

    public Memento(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
