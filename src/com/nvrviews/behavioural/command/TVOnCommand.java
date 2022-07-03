package com.nvrviews.behavioural.command;

public class TVOnCommand implements Command{

    public Television tv;

    public TVOnCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void executeCommand() {
        this.tv.powerOn();
    }
}
