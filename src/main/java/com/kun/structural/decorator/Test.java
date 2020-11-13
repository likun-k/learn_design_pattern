package com.kun.structural.decorator;

public class Test {


    public static void main(String[] args) {
        Coffee cappuccino = new Cappuccino();

        SugarCoffeeDecorator sugarCoffeeDecorator = new SugarCoffeeDecorator(cappuccino);
        sugarCoffeeDecorator.makeCoffee();
    }
}
