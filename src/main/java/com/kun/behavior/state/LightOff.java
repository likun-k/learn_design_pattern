package com.kun.behavior.state;

public class LightOff implements LightState {

    public LightOff() {
        System.out.println("灯关了...");
    }

    @Override
    public void press(Light light) {
        System.out.println("灯现在是光着的");
        light.setLightState(new LightOn());
    }
}
