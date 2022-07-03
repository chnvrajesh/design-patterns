package com.nvrviews.behavioural.chainofresp;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeToLog(String message) {
        System.out.println("DEBUG: " +message);
    }
}
