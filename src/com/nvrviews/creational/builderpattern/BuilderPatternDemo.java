package com.nvrviews.creational.builderpattern;

/**
 *  1. Builder pattern builds a complex object using simple objects by using step-by-step approach
 *  2. Used when we have more properties in the object to be constructed,
 *      and all are not mandatory to create the object
 *  3. If we define multiple constructors to handle all the possible different combinations of the object construction,
 *  it will lead to more no of constructors. It is tedious to maintain the code
 *  4. This multiple constructors' problem is called as "Telescoping Constructor problem"
 *  5. Builder design pattern is similar to "Fluent Interface", which follows method chaining.
 *  5. Create object class with getter methods, INNER OBJECT BUILDER class and PRIVATE constructor with
 *      builder object as parameter
 *  6. Create the inner builder class with default constructor and setter methods for each property with
 *      return type as builder class object
 *  7. Create build method in the inner class which will return actual object
 */

public class BuilderPatternDemo {
    public static void main(String[] args) {
        Car hyudaii10 = new Car.CarBuilder("Hyundai", "Hatchback")
                .engineCapacity("1200CC")
                .color("White")
                .fuelType("Petrol")
                .build();

        System.out.println(hyudaii10);

        Car tataPunch = new Car.CarBuilder("Tata", "SUV")
                .engineCapacity("1200CC")
                .color("orange")
                .fuelType("Petrol")
                .build();

        System.out.println(tataPunch);
    }
}
