package com.nvrviews.behavioural.mediator;

/**
 *  1. Mediator pattern provides a mediator between objects for communication and help in
 *      implementing lose-coupling between objects
 *  2. Mediator works as a router between objects
 */

public class MediatorPatternDemo {
    public static void main(String[] args) {
        MediatorPatternDemo mpd = new MediatorPatternDemo();

        ResidenceGroup residenceGroup = new ResidenceGroup();
        User rajesh = new User(1, "Rajesh", residenceGroup);
        User chinta = new User(2, "Chinta", residenceGroup);

        rajesh.postMessage("I am throwing a pary tomorrow...!");
        chinta.postMessage("WOW... it is wonderful..");
    }
}
