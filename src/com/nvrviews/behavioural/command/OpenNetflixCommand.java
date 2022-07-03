package com.nvrviews.behavioural.command;

public class OpenNetflixCommand implements Command{

    private Television tv;

    public OpenNetflixCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void executeCommand() {
        this.tv.openNetflix();
    }
}
