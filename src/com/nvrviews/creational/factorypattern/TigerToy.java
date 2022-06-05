package com.nvrviews.creational.factorypattern;

public class TigerToy implements Toy{

    @Override
    public void makeSound() {
        System.out.println("Roar roar...!");
    }
}
