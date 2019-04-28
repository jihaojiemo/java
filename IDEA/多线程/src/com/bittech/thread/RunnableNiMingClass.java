package com.bittech.thread;

public class RunnableNiMingClass {

    public static void main(String[] args) {

        System.out.println("main开始");

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i++) {
                    System.out.println("Runnable" + i);
                }
            }
        });
        thread.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("main循环"+i);
        }

        System.out.println("main结束");
    }
}
