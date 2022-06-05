package com.nvrviews.creational.factorypattern;

public class DogToy implements Toy{

    @Override
    public void makeSound() {
        System.out.println("Bow Bow...!");
    }
}
