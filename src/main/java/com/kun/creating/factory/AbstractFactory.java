package com.kun.creating.factory;

public interface AbstractFactory {

    default Animal create(){
        return null;
    }

    default Plant createPlant(String type){
        return null;
    }

}
