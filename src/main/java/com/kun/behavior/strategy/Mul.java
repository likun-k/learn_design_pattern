package com.kun.behavior.strategy;

public class Mul implements Calc {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
