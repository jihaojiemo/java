package com.bittech;

public class Message<T> {

    private T message;

    public T getMessage() {
        return message;
    }

    public void setMessage(T message) {
        this.message = message;
    }

    public static void main(String[] args) {

        Message<String> message = new Message<>();
        message.setMessage("Java is best");
        fun(message);
    }

    public static void fun(Message<? super String> message) {
        //message.setMessage("good");  //可以修改
        System.out.println(message.getMessage());
    }
}
