package com.nhnacademy.edu.springframework.xml;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.service.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigMain {

    public static void main(String[] args) {
        String loaction = "com.nhnacademy.edu.springframework.messagesender.config";
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(loaction);
        MessageSender koreanGreeter = context.getBean("koreanGreeter", MessageSender.class);
        MessageSender englishGreeter = context.getBean("englishGreeter", MessageSender.class);

        koreanGreeter.sendMessage(new User("asd","asdf"),"asfef");
        englishGreeter.sendMessage(new User("asd","asdf"),"asfef");
    }
}
