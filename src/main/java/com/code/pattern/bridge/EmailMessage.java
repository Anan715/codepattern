package com.code.pattern.bridge;

public class EmailMessage extends Message {
    public EmailMessage(String to, String message, MessageSender messageSender) {
        super(to, message, messageSender);
    }

    @Override
    public void send() {
        sendMessage();
    }
}


