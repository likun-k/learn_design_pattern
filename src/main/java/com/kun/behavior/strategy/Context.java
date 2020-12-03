package com.kun.behavior.strategy;

public class Context {

    private Calc calc;

    public Context(Calc calc) {
        this.calc = calc;
    }

    public int doCalc(int num1, int num2) {
        return calc.doOperation(num1, num2);
    }

}
