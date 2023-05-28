package com.code.pattern.bridge;

public abstract class Message {
    protected String to;
    protected String message;
    protected MessageSender messageSender;

    public Message(String to, String message, MessageSender messageSender) {
        this.to = to;
        this.message = message;
        this.messageSender = messageSender;
    }

    public void sendMessage() {
        messageSender.sendMessage(to, message);
    }

    public abstract void send();
}
