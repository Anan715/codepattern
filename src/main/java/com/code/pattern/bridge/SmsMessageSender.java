package com.code.pattern.bridge;

public class SmsMessageSender implements MessageSender {
    @Override
    public void sendMessage(String to, String message) {
        System.out.println("发送短信给 " + to + "，内容：" + message);
    }
}