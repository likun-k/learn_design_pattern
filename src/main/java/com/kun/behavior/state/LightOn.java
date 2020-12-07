package com.kun.behavior.state;

public class LightOn implements LightState {

    public LightOn() {
        System.out.println("灯开了...");
    }

    @Override
    public void press(Light light) {
        System.out.println("灯现在是开着的");
        light.setLightState(new LightOff());
    }
}
