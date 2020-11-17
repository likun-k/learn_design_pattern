package com.kun.structural.flyweight;

public class Test {

    /**
     * 运用共享技术来有效地支持大量细粒度对象的复用。
     * 通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
     */
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();  //创建享元工厂 创建对象

        Flyweight fa1 = factory.getFlyweight("a");
        Flyweight fa2 = factory.getFlyweight("a");
        Flyweight fa3 = factory.getFlyweight("a");
        Flyweight fb1 = factory.getFlyweight("b");
        Flyweight fb2 = factory.getFlyweight("b");

        fa1.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        fa2.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        fa3.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        fb1.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        fb2.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
    }

}
