package com.kun.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 统一的动态代理
 */
public class DynamicProxy implements InvocationHandler {

    private Object object;

    public DynamicProxy(Object obj){
        this.object = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // before
        System.out.println("do somethings before ...");

        //invoke method
        Object result = method.invoke(object, args);

        //after
        System.out.println("do somethings after ...");
        return result;
    }

}
