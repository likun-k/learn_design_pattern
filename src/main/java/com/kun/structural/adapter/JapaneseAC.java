package com.kun.structural.adapter;

public class JapaneseAC implements AC{

    public final int output = 110;//日本交流电 220V

    @Override
    public int outputAC() {
        return output;
    }
}
