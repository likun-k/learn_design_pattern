package com.kun.creating.factory;

public class CatFactory implements AbstractFactory {

    @Override
    public Animal create() {
        return new Cat();
    }

}
