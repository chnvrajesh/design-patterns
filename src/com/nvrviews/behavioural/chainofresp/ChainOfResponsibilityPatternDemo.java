package com.nvrviews.behavioural.chainofresp;

/**
 *  1. Chain of responsibility pattern is used to achieve loose coupling in software design where
 *      a request from the client is passed to a chain of objects to process them
 *  2. This pattern is recommended when multiple objects can handle a request and the handler doesn’t have to
 *      be a specific object. Also, the handler is determined at runtime.
 */

public class ChainOfResponsibilityPatternDemo {
    public static void main(String[] args) {
        ChainOfResponsibilityPatternDemo obj = new ChainOfResponsibilityPatternDemo();

        AbstractLogger logger = obj.getLoggerChain();
        logger.logMesage(2, "Logging Message");

    }

    private AbstractLogger getLoggerChain(){
        AbstractLogger info = new InfoLogger(1);
        AbstractLogger debug = new DebugLogger(2);
        AbstractLogger error = new ErrorLogger(3);

        info.setNextLogger(debug);
        debug.setNextLogger(error);

        return info;
    }
}
