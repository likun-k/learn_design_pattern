package com.kun.structural.bridge;

public class Test {

    public static void main(String[] args) {

        DataFile html = new Html();
        html.setDataBase(new MysqlDB());
        html.saveTo();

    }

}
