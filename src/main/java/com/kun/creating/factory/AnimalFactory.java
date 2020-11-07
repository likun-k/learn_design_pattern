package com.kun.creating.factory;

/**
 * 简单工厂  动物工厂
 */
public class AnimalFactory {

    public enum AnimalType {
        CAT, DOG
    }

    public Animal toHaveBaby(AnimalType type) {
        if (type == AnimalType.CAT) {
            return new Cat();
        } else if (type == AnimalType.DOG) {
            return new Dog();
        }
        return null;
    }


}
