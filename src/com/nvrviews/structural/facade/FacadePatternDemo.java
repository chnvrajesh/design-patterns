package com.nvrviews.structural.facade;

/**
 *  1. Used when we have complex system that need to be exposed to client in a simplified way, by hiding
 *      internal complexity of the system
 */

public class FacadePatternDemo {
    public static void main(String[] args) {
        OnlineTransferFacade facade = new OnlineTransferFacade();
        facade.transferAmount(1, 2, 30000);
    }
}
