package com.kun.behavior.nil;

public interface CustomerInterface {

    default boolean isNil(){
        return true;
    }

    default String getName(){
        return "this customer is null!";
    }

}
