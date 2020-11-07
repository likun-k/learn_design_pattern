package com.kun.creating.factory;

public class Dog implements Animal {


    @Override
    public void eat(String food) {
        System.out.println("dog eat " + food);
    }
}
