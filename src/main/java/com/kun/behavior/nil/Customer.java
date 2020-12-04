package com.kun.behavior.nil;

public class Customer implements CustomerInterface{

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
