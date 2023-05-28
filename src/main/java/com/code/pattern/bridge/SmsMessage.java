package com.code.pattern.bridge;

public class SmsMessage extends Message {
    public SmsMessage(String to, String message, MessageSender messageSender) {
        super(to, message, messageSender);
    }

    @Override
    public void send() {
        sendMessage();
    }
}
