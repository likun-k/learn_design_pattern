package com.kun.behavior.nil;

public class Test {


    public static void main(String[] args) {

        CustomerInterface customer1 = CustomerDatabase.selectByCustomerName("Rob");
        CustomerInterface customer2 = CustomerDatabase.selectByCustomerName("Bob");
        CustomerInterface customer3 = CustomerDatabase.selectByCustomerName("Julie");
        CustomerInterface customer4 = CustomerDatabase.selectByCustomerName("Laura");

        System.out.println("Customers : ");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());

    }
}
