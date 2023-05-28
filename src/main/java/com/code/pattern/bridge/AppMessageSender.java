package com.code.pattern.bridge;

public class AppMessageSender implements MessageSender {
    @Override
    public void sendMessage(String to, String message) {
        System.out.println("发送APP消息给 " + to + "，内容：" + message);
    }
}