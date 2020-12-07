package com.kun.behavior.state;

public class Light {

    private LightState lightState;

    public Light(LightState lightState) {
        this.lightState = lightState;
    }

    public void pressSwitch(){
        lightState.press(this);
    }

    public LightState getLightState() {
        return lightState;
    }

    public void setLightState(LightState lightState) {
        this.lightState = lightState;
    }
}
