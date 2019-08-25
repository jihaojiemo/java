package com.github.jihaojiemo.method;

public class TestSleep {

    public static void main(String[] args) {

        Runnable runnable = new MySleepRunnable();
        //A、B、C不是同时休眠的，各自休眠自己的，没有关系
        new Thread(runnable, "Thread-A").start();
        new Thread(runnable, "Thread-B").start();
        new Thread(runnable, "Thread-C").start();
    }
}

class MySleepRunnable implements Runnable {

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("当前线程是：" + Thread.currentThread().getName() + " " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}