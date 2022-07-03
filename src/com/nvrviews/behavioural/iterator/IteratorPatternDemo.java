package com.nvrviews.behavioural.iterator;

/**
 *  1. Commonly used to loop through a collection of objects
 *  2. Widely used in iteration of data structures in all programming languages
 */

public class IteratorPatternDemo {
    public static void main(String[] args) {
        IteratorPatternDemo ipd = new IteratorPatternDemo();

        StringContainer sc = new StringContainer();
        sc.add("Rajesh");
        sc.add("Chinta");

        Iterator i = sc.getIterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}
