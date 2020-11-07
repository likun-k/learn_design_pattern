package com.kun.creating.factory;

/**
 * 动物
 */
public interface Animal {

    void eat(String food);

    default void run(){
        System.out.println("running ...");
    }

}
