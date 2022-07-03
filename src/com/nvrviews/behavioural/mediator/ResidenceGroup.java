package com.nvrviews.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ResidenceGroup implements WhatsappGroup{

    List<User> members = new ArrayList<>();

    public void addUser(User u){
        this.members.add(u);
    }

    @Override
    public void postMessage(String msg, String UserName) {
        System.out.println(UserName + ": "+msg);
    }
}
