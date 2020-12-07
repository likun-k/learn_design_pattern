package com.kun.behavior.state;

public class Test {

    public static void main(String[] args) {
        //默认灯是光着的
        Light light = new Light(new LightOff());

        // 第一次按电灯开关
        light.pressSwitch();

        System.out.println("===== 要睡觉了，帮我关下灯=====");

        light.pressSwitch();

    }
}
