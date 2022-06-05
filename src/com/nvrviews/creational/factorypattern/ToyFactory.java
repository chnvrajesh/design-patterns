package com.nvrviews.creational.factorypattern;

public class ToyFactory {
    public Toy getToy(String toyType){
        if(toyType == null){
            return null;
        }else if(toyType.equalsIgnoreCase("dog")){
            return new DogToy();
        }else if(toyType.equalsIgnoreCase("cat")){
            return new CatToy();
        }else if(toyType.equalsIgnoreCase("tiger")){
            return new TigerToy();
        }else{
            return null;
        }
    }
}
