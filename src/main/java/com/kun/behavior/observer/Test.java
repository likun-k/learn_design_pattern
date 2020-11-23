package com.kun.behavior.observer;

public class Test {

    public static void main(String[] args) {
        SubscriptionSubject subject = new SubscriptionSubject();

        //订阅公众号
        subject.registerObserver(new WechatUser("张三"));
        subject.registerObserver(new WechatUser("李四"));
        subject.registerObserver(new WechatUser("王二"));
        subject.registerObserver(new WechatUser("麻子"));

        //公众号更新发出消息
        subject.notifyObservers("马保国谈武德");
    }
}
