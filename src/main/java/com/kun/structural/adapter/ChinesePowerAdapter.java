package com.kun.structural.adapter;

public class ChinesePowerAdapter implements DC5Adapter{

    public static final int voltage = 220;

    @Override
    public boolean support(AC ac) {
        return voltage == ac.outputAC();
    }

    @Override
    public int outputDC5V(AC ac) {
        int adapterInput = ac.outputAC();
        //模拟变压器...
        int adapterOutput = adapterInput / 44;
        System.out.println("使用 220V 变压适配器，输入AC:" + adapterInput + "V" + "，输出DC:" + adapterOutput + "V");
        return adapterOutput;
    }

}

