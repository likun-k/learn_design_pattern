package com.kun.structural.decorator;

public class Cappuccino implements Coffee{

    @Override
    public void makeCoffee() {
        System.out.println("做了一杯卡布奇诺。");
    }
}
