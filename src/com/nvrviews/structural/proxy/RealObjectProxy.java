package com.nvrviews.structural.proxy;

public class RealObjectProxy implements RealObject{

    RealObject ro;

    @Override
    public void doAction() {
        if (ro == null){
            ro = new RealObjectImpl();
        }

        ro.doAction();
    }
}
