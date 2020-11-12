package com.kun.creating;

/**
 * 原型模式
 * Cloneable是一个“标记接口”
 */
public class MonkeySunPrototype implements Cloneable{

    // private ...


    /**
     *  只有当一个类实现了Cloneable接口后，该类才会被赋予调用重写自Object类的clone方法的权利。
     *  否则会抛出“CloneNotSupportedException”异常。
     *
     */
    @Override
    public Object clone() {
        MonkeySunPrototype monkeySun = null;
        try {
            monkeySun = (MonkeySunPrototype) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return monkeySun;
    }
}
