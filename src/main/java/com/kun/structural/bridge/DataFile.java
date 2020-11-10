package com.kun.structural.bridge;

public abstract class DataFile {

    protected Database database;

    public void setDataBase(Database database){
        this.database = database;
    }

    public abstract void saveTo();

}
