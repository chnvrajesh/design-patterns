package com.nvrviews.behavioural.mediator;

import com.nvrviews.behavioural.command.RemoteControl;

public class User {

    private int id;
    private String name;

    private ResidenceGroup mediator;

    public User(int id, String name, ResidenceGroup grp) {
        this.id = id;
        this.name = name;
        this.mediator = grp;
    }

    public void postMessage(String message){
        mediator.postMessage(message, this.name);
    }
}
