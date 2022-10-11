package com.nhnacademy.edu.springframework.messagesender.service;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
//    private final MessageSender messageSender;
    private SmsMessageSender smsMessageSender;
    private EmailMessageSender emailMessageSender;

    public MessageSendService(SmsMessageSender smsMessageSender, EmailMessageSender emailMessageSender) {
        this.smsMessageSender = smsMessageSender;
        this.emailMessageSender = emailMessageSender;
    }

    public void doSendMessage() {

        smsMessageSender.sendMessage(new User("nhnacademy.com","010-1234-5678"),"message");
        emailMessageSender.sendMessage(new User("nhnacademy.com","010-1234-5678"),"message");
    }

}
