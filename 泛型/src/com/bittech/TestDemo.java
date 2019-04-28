package com.bittech;

interface IMessage<T> {
    void print(T t);
}

class MessageImpl implements IMessage<String> {

    @Override
    public void print(String t) {
        System.out.println(t);
    }
}

public class TestDemo {
    public static void main(String[] args) {
        IMessage<String> msg = new MessageImpl();
        msg.print("Hello world");
    }
}
