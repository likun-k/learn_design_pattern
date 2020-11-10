package com.kun.structural.bridge;

public class MysqlDB implements Database{

    @Override
    public void load() {
        System.out.println("从 mysql 数据库得到数据！");
    }
}
