package com.kun.structural.bridge;

public class Html extends  DataFile{

    @Override
    public void saveTo() {
        database.load();
        System.out.println("将数据保存为 Html 文件。");
    }
}
