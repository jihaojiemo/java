package com.bittech.thread;

public class RunnableLambda {

    public static void main(String[] args) {

        System.out.println("main开始");

        Thread thread = new Thread(() -> {
           for(int i = 0; i < 10; i++) {
               System.out.println("runnable" + i);
           }
        });
        thread.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("main循环"+i);
        }

        System.out.println("main结束");
    }
}
