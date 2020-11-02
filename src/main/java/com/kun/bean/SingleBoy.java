package com.kun.bean;


/**
 * 单例
 */
public class SingleBoy {

    private static SingleBoy instance;

    private SingleBoy(){}

    /**
     * 懒汉式，线程安全
     */
    public synchronized static SingleBoy getInstance(){
        if(null == instance){
            instance = new SingleBoy();
        }
        return instance;
    }

    /**
     * 饿汉式
     */
    public static class HungryMan {
        private static HungryMan instance = new HungryMan();

        private HungryMan() {
        }

        public static HungryMan getInstance() {
            return instance;
        }
    }

}
