package com.kun.structural.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();

        phones.add(new Phone(1000, "小米"));
        phones.add(new Phone(1500, "huaWei"));
        phones.add(new Phone(2000, "apple"));

        List<Phone> result = new PriceFilter().filter(phones);

        // 使用stream
        List<Phone> collect = phones
                .stream()
                .filter(phone -> phone.getPrice() > 1000 && null != phone.getBrand())
                .collect(Collectors.toList());

    }

}
