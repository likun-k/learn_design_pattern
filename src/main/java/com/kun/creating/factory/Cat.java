package com.kun.creating.factory;

public class Cat implements Animal {


    @Override
    public void eat(String food) {
        System.out.println("cat eat " + food);
    }

}
