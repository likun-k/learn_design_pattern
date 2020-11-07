package com.kun.creating;

import java.sql.Connection;

/**
 * by effective java
 */
public enum SingletonEnum {

    INSTANCE;

    public void doSomeThing(){
        System.out.println("使用enum 单例！");
    }

    private Connection conn;

    /**
     * ex
     */
    public Connection getConn(){
        if(null == conn){
            // do new conn
        }
        return conn;
    }

}
