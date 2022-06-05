package com.nvrviews.creational.factorypattern;

/**
 *  1. Used to create object without exposing the creation logic to the client
 *  2. Create an interface which will be the prototype for the factory object
 *  3. Create classes by implementing the interface
 *  4. Create Factory class with createFactoryObject() method with objectType as argument
 *  5. Use if-else/switch condition to create factory object based on the "type" provided
 *  6. Crate implementation class to use the Factory Class
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ToyFactory t = new ToyFactory();

        Toy toy = t.getToy("dog");
        toy.makeSound();

        toy = t.getToy("cat");
        toy.makeSound();

        toy = t.getToy("tiger");
        toy.makeSound();
    }
}
