package com.nvrviews.behavioural.Memento;

/**
 *  1. Memento pattern is used to restore state of an object to a previous state
 */

public class MementoPatternDemo {
    public static void main(String[] args) {
        MementoPatternDemo mpd = new MementoPatternDemo();

        StateController sc = new StateController();

        Message m = new Message(1, "Offer Letter", "SENT");
        sc.add(m.getMemento());
        m.setStatus("READ");
        m.setStatus("ACKNOWLEDGED");
        sc.add(m.getMemento());
        m.setStatus("ARCHIVED");

        Message restore = (Message) sc.get(1).getObject();

        System.out.println(m.toString());
        System.out.println(restore.toString());

    }
}
