package com.kun.structural.decorator;

public class SugarCoffeeDecorator extends CoffeeDecorator {


    public SugarCoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void makeCoffee() {
        super.makeCoffee();
        //装饰 ...
        System.out.println("给做好的咖啡加糖。");
    }
}
