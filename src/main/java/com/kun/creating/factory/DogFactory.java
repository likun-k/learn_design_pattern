package com.kun.creating.factory;

public class DogFactory implements AbstractFactory {

    @Override
    public Animal create() {
        return new Dog();
    }

}
