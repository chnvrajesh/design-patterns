package com.nvrviews.behavioural.chainofresp;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void writeToLog(String message) {
        System.out.println("CONSOLE: " +message);
    }
}
