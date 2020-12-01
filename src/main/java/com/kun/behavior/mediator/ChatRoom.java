package com.kun.behavior.mediator;

import java.time.LocalDateTime;

/**
 * 聊天室
 */
public class ChatRoom {

    public void sendMsg(User user, String msg){
        System.out.println(String.format("[%s] —— [%s] : %s", LocalDateTime.now().toString(), user.getName(), msg));
    }


}
