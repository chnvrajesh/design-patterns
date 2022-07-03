package com.nvrviews.structural.proxy;

/**
 *  1. We can use PROXY when we want to use a class that can ACT as an INTERFACE to REAL OBJECT
 *  2. Proxy is heavily used to implement lazy loading related Usecases, where we do not want to
 *      load full object until it is actually needed
 */

public class ProxyPatternDemo {
    public static void main(String[] args) {
        RealObject obj = new RealObjectProxy();
        obj.doAction();
    }
}
