package com.nvrviews.behavioural.chainofresp;

public abstract class AbstractLogger {

    protected int level;
    private AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger logger){
        this.nextLogger = logger;
    }

    protected abstract void writeToLog(String message);

    public void logMesage(int logLevel, String message){
        if(this.level == logLevel){
            writeToLog(message);
            return;
        }

        if(nextLogger != null){
            nextLogger.logMesage(logLevel, message);
        }
    }


}
