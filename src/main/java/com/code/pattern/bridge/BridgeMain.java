package com.code.pattern.bridge;

public class BridgeMain {
    /**
     * 桥接模式的典型场景是消息发送器。消息发送器需要支持多种消息类型（比如邮箱消息、
     * 短信消息、APP 消息等）和多种发送方式（比如同步发送、异步发送、定时发送等），
     * 这样就存在多个维度的变化。
     *
     * 使用桥接模式可以将每个维度的变化封装在不同的抽象和具体实现类中，
     * 并让它们独立变化。这样可以避免因为一个维度的变化而影响到其他维度，
     * 同时也便于扩展和管理。
     */
    public static void main(String[] args) {
        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage("tom@example.com", "Hello, World!", emailMessageSender);
        emailMessage.send();

        MessageSender smsMessageSender = new SmsMessageSender();
        Message smsMessage = new SmsMessage("13888888888", "Hello, World!", smsMessageSender);
        smsMessage.send();

        MessageSender appMessageSender = new AppMessageSender();
        Message appMessage = new AppMessage("Tom", "Hello, World!", appMessageSender);
        appMessage.send();

    }
}
