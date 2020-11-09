package com.kun.structural.adapter;

import java.util.LinkedList;
import java.util.List;

public class Test {

    private List<DC5Adapter> adapters = new LinkedList<>();
    // 1. 将适配器放到list中
    public Test() {
        this.adapters.add(new ChinesePowerAdapter());
        this.adapters.add(new JapanesePowerAdapter());
    }

    // 2. 循环判断 是否支持，如果适配就返回
    public DC5Adapter getPowerAdapter(AC ac) {
        for (DC5Adapter ad : this.adapters) {
            if (ad.support(ac)) {
                return ad;
            }
        }
        throw new  IllegalArgumentException("没有找到合适的变压适配器");
    }

    public static void main(String[] args) {
        Test test = new Test();
        AC chinaAC = new ChineseAC();
        DC5Adapter adapter = test.getPowerAdapter(chinaAC);
        adapter.outputDC5V(chinaAC);

        // 去日本旅游，电压是 110V
        AC japanAC = new JapaneseAC();
        adapter = test.getPowerAdapter(japanAC);
        adapter.outputDC5V(japanAC);
    }

}
