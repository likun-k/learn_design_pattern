package com.kun.behavior.mediator;

public class Test {

    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User jack = new User("jack");
        User tom = new User("tom");
        User jerry = new User("jerry");

        chatRoom.sendMsg(jack, "hello !");
        chatRoom.sendMsg(jack, "h");
        chatRoom.sendMsg(tom, "111");
        chatRoom.sendMsg(jerry, "111");
    }
}
