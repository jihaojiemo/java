package com.bittech;

interface IMessage {

    //普通方法，实现类选择性覆写
    default void greeting() {
        System.out.println("这是Message的普通方法");
    }

    //静态方法
    static void messageInfo() {
        System.out.println("这是Message的静态方法");
    }

    //抽象方法
    void print();
}

class QQMessage implements IMessage {

    @Override
    public void greeting() {
        System.out.println("沟通多一点");
    }

    @Override
    public void print() {
        System.out.println("QQMessage print");
    }
}

class WeChatMessage implements IMessage {

    @Override
    public void print() {
        System.out.println("WeChatMessage print");
    }
}

public class Message {
    public static void main(String[] args) {

        //静态方法通过接口名调用
        IMessage.messageInfo();

        IMessage qqMessage = new QQMessage();
        qqMessage.greeting();
        qqMessage.print();
        IMessage weChatMessage = new WeChatMessage();
        weChatMessage.print();

    }
}

