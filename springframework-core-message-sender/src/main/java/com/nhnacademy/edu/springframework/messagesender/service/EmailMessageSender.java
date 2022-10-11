package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender{
    public EmailMessageSender() {
        System.out.println("email-log 탄생");
    }
    public void destroy() {
        System.out.println("destroy method called in EmailMessageSender");
    }
    @Override
    public void sendMessage(User user, String message) {
        System.out.println("-----------------send email");
    }
}
