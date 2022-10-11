package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender{
    public SmsMessageSender() {
        System.out.println("sms-log 탄생");
    }
    public void init() {
        System.out.println("init method called in SmsMessageSender");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("-------------send message");
    }
}
