package com.kun.creating;

import java.util.Date;

/**
 * 1. 创建一个人  可能需要传非常多的参数
 */
public class Person {

    private String name;
    private int age;
    private Date birthday;

    // private ... 各种属性
    // 2. 如果用构造方法
    public Person() {
        this(null, 0, null);
    }

    public Person(String name) {
        this(name, 0, null);
    }
    // ... 非常多的构造方法
    public Person(String name, int age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    //3. 或者使用 get set 方法    省略 get set...

    /**
     * 4. 建造者模式  builder
     */
    public Person(Person origin) {
        this.name = origin.name;
        this.age = origin.age;
        this.birthday = origin.birthday;
    }
    public static class Builder{

        private Person person;

        public Builder(){
            person = new Person();
        }
        // 也可以增加 参数的构造方法

        public Builder name(String name){
            person.name = name;
            return this;
        }
        public Builder age(int age){
            person.age = age;
            return this;
        }
        public Builder birthday(Date date){
            person.birthday = date;
            return this;
        }
        //5. 最后，调用无参的build方法来生成不可变的对象
        public Person build(){
            return new Person(person);
        }
    }

}
