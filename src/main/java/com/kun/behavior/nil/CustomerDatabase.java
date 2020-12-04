package com.kun.behavior.nil;

/**
 * 模拟 数据库
 */
public class CustomerDatabase {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static CustomerInterface selectByCustomerName(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new Customer(name);
            }
        }
        return new NullCustomer();
    }


}
