package com.kun.structural.proxy.dynamic;

import com.kun.structural.proxy.UserService;
import com.kun.structural.proxy.statical.UserServiceImpl;

import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        /**
         * ClassLoader loader:指定当前目标对象使用的类加载器,获取加载器的方法是固定的
         * Class<?>[] interfaces:指定目标对象实现的接口的类型,使用泛型方式确认类型
         * InvocationHandler:指定动态处理器，执行目标对象的方法时,会触发事件处理器的方法
         */
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),
                new Class[]{UserService.class},
                new DynamicProxy(userService));
        userServiceProxy.login();
    }

}
