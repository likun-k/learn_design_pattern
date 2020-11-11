package com.kun.structural.filter;

import java.util.ArrayList;
import java.util.List;

public class PriceFilter implements FilterInterface {

    @Override
    public List<Phone> filter(List<Phone> phones) {
        List<Phone> tmp = new ArrayList<>();
        // 简单的实现  价格大于1000 的
        for(Phone p : phones){
            if(p.getPrice() > 1000){
                tmp.add(p);
            }
        }
        return tmp;
    }

}
