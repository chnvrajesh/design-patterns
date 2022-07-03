package com.nvrviews.behavioural.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        CommandPatternDemo remote = new CommandPatternDemo();

        Television tv = new Television();
        RemoteControl rc = new RemoteControl(tv);

        rc.pressButton(1);
        rc.pressButton(2);
        rc.pressButton(3);
    }
}
