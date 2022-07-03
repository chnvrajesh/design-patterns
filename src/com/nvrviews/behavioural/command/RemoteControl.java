package com.nvrviews.behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    Map<Integer, Command> remote = new HashMap<>();
    Television television;

    public RemoteControl(Television tv) {
        this.television = tv;
        System.out.println(this.television);

        remote.put(1, new TVOnCommand(this.television));
        remote.put(2, new OpenNetflixCommand(this.television));
        remote.put(3, new OpenPrimevideoCommand(this.television));
    }

    public void pressButton(int button){
        this.remote.get(button).executeCommand();
    }
}
