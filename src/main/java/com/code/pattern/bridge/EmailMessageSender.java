package com.code.pattern.bridge;

public class EmailMessageSender implements MessageSender {
    @Override
    public void sendMessage(String to, String message) {
        System.out.println("发送邮件给 " + to + "，内容：" + message);
    }
}




