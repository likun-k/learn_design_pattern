package com.kun.structural.bridge;

public class OracleDB implements Database{

    @Override
    public void load() {
        System.out.println("从 Oracle 数据库得到数据！");
    }
}
