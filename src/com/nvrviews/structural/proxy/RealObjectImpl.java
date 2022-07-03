package com.nvrviews.structural.proxy;

public class RealObjectImpl implements RealObject{

    @Override
    public void doAction() {
        System.out.println("Action Performed");
    }
}
