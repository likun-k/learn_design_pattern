package com.kun.structural.decorator;

public class American implements Coffee{

    @Override
    public void makeCoffee() {
        System.out.println("做了一杯美式咖啡。");
    }

}
