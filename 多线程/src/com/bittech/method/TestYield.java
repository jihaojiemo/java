package com.bittech.method;

public class TestYield {

    public static void main(String[] args) {

        //yield没有时间概念
        Runnable runnable = new MyYieldRunnable();
        new Thread(runnable, "Thread-A").start();
        new Thread(runnable, "Thread-B").start();
        new Thread(runnable, "Thread-C").start();

    }
}

class MyYieldRunnable implements Runnable {

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {

            Thread.yield();
            System.out.println("当前线程是：" + Thread.currentThread().getName() + " " + i);
        }
    }
}