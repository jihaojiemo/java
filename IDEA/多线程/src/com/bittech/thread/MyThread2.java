package com.bittech.thread;

public class MyThread2 {

    public static void main(String[] args) {

        Runnable runnable = new MyRunnable("MyRunnable");

        System.out.println("mian开始");

//        Thread myThread = new Thread(runnable);
//        myThread.start();

        //复用
        Thread myThread1 = new Thread(runnable);
        Thread myThread2 = new Thread(runnable);
        Thread myThread3 = new Thread(runnable);
        myThread1.start();
        myThread2.start();
        myThread3.start();

        for(int i = 0; i < 10; i++) {
            System.out.println("main循环" + i);
        }

        System.out.println("main结束");

    }
}


class MyRunnable implements Runnable {

    private String title;

    public MyRunnable(String title) {
        this.title = title;
    }

    @Override
    public void run() {
        for(int i= 0; i<10; i++) {
            System.out.println(this.title + " " + i);
        }
    }
}