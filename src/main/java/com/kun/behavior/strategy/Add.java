package com.kun.behavior.strategy;

public class Add implements Calc {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
