package com.kun.behavior.command;

/**
 * 电灯泡
 */
public class Bulb {

    private boolean flag = false;

    public void turnOn(){
        flag = true;
        System.out.println("开灯");
    }

    public void turnOff(){
        flag = false;
        System.out.println("关灯");
    }

    public void status(){
        System.out.println("灯现在是：" + (flag?"开着的":"关着的"));
    }

}
