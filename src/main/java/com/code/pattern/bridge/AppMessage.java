package com.code.pattern.bridge;


public class AppMessage extends Message {
    public AppMessage(String to, String message, MessageSender messageSender) {
        super(to, message, messageSender);
    }

    @Override
    public void send() {
        sendMessage();
    }
}
