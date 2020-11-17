package com.kun.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String key;

    ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("ConcreteFlyweight : 具体享元" + key + "被创建！");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("ConcreteFlyweight : 具体享元" + key + "被调用，");
        System.out.println("ConcreteFlyweight : 非享元信息是:" + state.getInfo());
    }

}
