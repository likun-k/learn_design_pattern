package com.kun.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 微信公众号 订阅主题
 */
public class SubscriptionSubject implements Subject {
    //储存订阅公众号的微信用户
    private List<Observer> wechatUserlist = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        wechatUserlist.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        wechatUserlist.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : wechatUserlist) {
            observer.update(message);
        }
    }
}
