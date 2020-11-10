package com.kun.structural.bridge;

public class Txt extends  DataFile{

    @Override
    public void saveTo() {
        database.load();
        System.out.println("将数据保存为 txt 文件。");
    }
}
