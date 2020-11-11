package com.kun.structural.filter;

/**
 * 定义一个 用来作过滤的类
 */
public class Phone {

    private int price;

    private String brand;

    public Phone(int price, String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
