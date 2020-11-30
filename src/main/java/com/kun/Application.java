package com.kun;

import com.kun.creating.Person;
import com.kun.creating.SingleBoy;

import java.io.File;
import java.util.Date;

public class Application {

    public static void main(String[] args) {
        SingleBoy.HungryMan instance = SingleBoy.HungryMan.getInstance();

        Person lk = new Person.Builder()
                .age(22)
                .name("lk")
                .birthday(new Date())
                .build();


    }

}
