package com.kun.structural.facade;

public class Test {

    public static void main(String[] args) {
        new CoreService().onceCall();
    }

}

class CoreService{

    /**
     * 本来要分别调用三次   现在只需要调用一次==门面、外观模式
     */
    public void onceCall(Object... objs){
        first();
        second();
        third();
    }

    public void first(){
        // do ...
        System.out.println("第1次调用..");
    }

    public void second(){
        // do ...
        System.out.println("第2次调用..");
    }

    public void third(){
        // do ...
        System.out.println("第3次调用..");
    }

}
