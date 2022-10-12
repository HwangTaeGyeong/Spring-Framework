package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.service.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.service.SmsMessageSender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;

@Configuration
public class MainConfig {
    @Bean("koreanGreeter")
    public MessageSender emailMessageSender(){
        return new EmailMessageSender();
    }

    @Bean("englishGreeter")
    public MessageSender smsMessageSender(){
        return new SmsMessageSender();
    }
}