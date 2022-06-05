package com.nvrviews.creational.prototypepattern;

public interface PrototypeCapable extends Cloneable {
    public PrototypeCapable clone() throws CloneNotSupportedException;
}
