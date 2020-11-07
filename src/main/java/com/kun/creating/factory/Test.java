package com.kun.creating.factory;

/**
 *  idea 可以右键 factory包 -> Diagrams 查看类图
 */
public class Test {


    public static void main(String[] args) {
        //简单工厂
        AnimalFactory animalFactory = new AnimalFactory();

        Cat cat = (Cat) animalFactory.toHaveBaby(AnimalFactory.AnimalType.CAT);
        cat.eat("some ...");

        Dog dog = (Dog) animalFactory.toHaveBaby(AnimalFactory.AnimalType.DOG);

        //工厂方法
        CatFactory catFactory = new CatFactory();
        Cat cat2 = (Cat) catFactory.create();
        cat2.run();

        // 抽象工厂   抽象工厂 是 工厂方法 的升级
        AbstractFactory factory = byclazz(Weed.class);
        Plant weed = factory.createPlant("weed");
        System.out.println(weed);
        weed.create();

    }

    /**
     * 根据传的class 返回什么工厂
     */
    public static AbstractFactory byclazz(Class clazz){
        if(clazz == Cat.class){
            return new CatFactory();
        }else if(clazz == Dog.class) {
            return new DogFactory();
        } else if(clazz == Weed.class){
            return new PlantFactory();
        }
        return null;
    }

}
