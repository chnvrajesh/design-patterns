package com.nvrviews.creational.factorypattern;

public class CatToy implements Toy{

    @Override
    public void makeSound() {
        System.out.println("Meow meow...!");
    }
}
