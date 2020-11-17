package com.kun.structural.proxy.statical;

import com.kun.structural.proxy.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void login() {
        System.out.println("用户登录！ 。。。");
    }

}
