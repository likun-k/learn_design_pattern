package com.kun.structural.proxy.statical;

import com.kun.structural.proxy.UserService;

public class UserServiceProxy implements UserService {

    private UserService userService;

    public UserServiceProxy(final UserService userService){
        this.userService = userService;
    }

    @Override
    public void login() {
        before();
        userService.login();
        after();
    }

    private void before() {
        System.out.println("代理： 方法前执行。。。");
    }

    private void after() {
        System.out.println("代理： 方法后执行。。。");
    }

}
