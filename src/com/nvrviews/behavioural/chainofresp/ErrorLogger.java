package com.nvrviews.behavioural.chainofresp;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeToLog(String message) {
        System.out.println("ERROR: " +message);
    }
}
