package com.nvrviews.behavioural.command;

public class OpenPrimevideoCommand implements Command{

    private Television tv;

    public OpenPrimevideoCommand(Television tv) {
        this.tv = tv;
    }

    @Override
    public void executeCommand() {
        this.tv.openPrimevideo();
    }
}
