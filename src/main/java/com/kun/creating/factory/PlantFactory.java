package com.kun.creating.factory;

public class PlantFactory implements AbstractFactory {


    @Override
    public Plant createPlant(String type) {
        // create by type ...
        if("weed".equals(type)){
            return new Weed();
        }
        return null;
    }

}
