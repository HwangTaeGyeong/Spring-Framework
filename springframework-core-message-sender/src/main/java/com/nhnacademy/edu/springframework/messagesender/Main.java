package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String args[]) {
        Main main = new Main();
        User user = new User("nhnacademy.com", "010-1234-5678");
        main.sendSmsMessage(user, "message");
    }
    public void sendSmsMessage(User user, String message) {
        System.out.println( "SMS Message Sent to ${" + user.phoneNumber + "} : ${" + message + "}");
    }
    public void sendEmailMessage(User user, String message) {
        System.out.println( "Email Message Sent ${" + user.email + "} : ${" + message + "}");
    }
}
