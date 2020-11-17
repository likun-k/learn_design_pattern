package com.kun.structural.proxy.statical;

import com.kun.structural.proxy.UserService;

public class Test {

    /**
     * 静态代理：   可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
     * 需要自己创建代理对象
     */
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.login();
    }

}
