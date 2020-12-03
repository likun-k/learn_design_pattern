package com.kun.behavior.strategy;

public class Test {

    public static void main(String[] args) {
        Context add = new Context(new Add());
        System.out.println(add.doCalc(1, 2));

        Context sub = new Context(new Sub());
        System.out.println(sub.doCalc(1, 2));

        Context mul = new Context(new Mul());
        System.out.println(mul.doCalc(1, 2));

    }
}
