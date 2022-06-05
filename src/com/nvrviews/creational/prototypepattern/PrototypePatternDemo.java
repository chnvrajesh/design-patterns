package com.nvrviews.creational.prototypepattern;

/**
 *  1. A prototype is a template of any object before the actual object is constructed
 *  2. Used in scenarios where application needs to create a number of instances of a class, which has
 *      almost same state or differs very little
 *  3. Ex: clone feature in Jira application
 *  4. Create an interface "ProtypeCapable" which extends "Cloneable" Interface
 *  5. Override clone() method which will return ProtypeCapable type of object
 *  6. Create class(s) implementing PrototypeCapable and override clone() method with implementation logic as "super.clone()"
 *  7.
 */

public class PrototypePatternDemo {
    public static void main(String[] args) throws CloneNotSupportedException {

        Epic e = new Epic("User Login Page Construction", "Login page with username, pwd and login button");
        Story s = new Story("create login page uI", "add username, password and login button");

        e.getStories().add(s);
        e.getStories().add(s.clone());

        System.out.println(e);
    }
}
