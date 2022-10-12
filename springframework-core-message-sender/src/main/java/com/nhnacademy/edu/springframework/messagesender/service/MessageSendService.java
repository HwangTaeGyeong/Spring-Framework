package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageSendService {
    private MessageSender messageSender;
//    public MessageSendService() {}
//    public MessageSendService(MessageSender messageSender) {
//        System.out.println("-------Constructor Injection---------");
//        this.messageSender = messageSender;
//    }
    @Autowired
    public  void setKoreanGreeter(@SMS("koreanGreeter") MessageSender messageSender) {
        System.out.println("setMessageSender invoked!!");
        this.messageSender = messageSender;
    }
    public void doSendMessage() {
        messageSender.sendMessage(new User("nhnacademy.com","010-1234-5678"),"message");
    }
}
