package com.kun.structural.adapter;

/**
 * 交流电 适配器 DC5V
 */
public interface DC5Adapter {

    boolean support(AC ac);

    int outputDC5V(AC ac);

}
