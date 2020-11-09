package com.kun.structural.adapter;

public class ChineseAC implements AC{

    public final int output = 220;//中国的交流电是220V

    @Override
    public int outputAC() {
        return output;
    }
}
