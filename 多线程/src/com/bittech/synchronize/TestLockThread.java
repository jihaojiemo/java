package com.bittech.synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockThread {

    public static void main(String[] args) {

        Runnable runnable = new MyLockRunnable();
        new Thread(runnable, "ThreadA").start();
        new Thread(runnable, "ThreadB").start();
        new Thread(runnable, "ThreadC").start();
    }
}

class MyLockRunnable implements Runnable {

    private final Lock lock = new ReentrantLock();
    private int ticket = 10;

    @Override
    public void run() {
        while (this.ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            lock.lock();
            try {
                if(this.ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖票剩余：" + (--this.ticket) + "张");
                }
            } finally {
                lock.unlock();
            }
        }

    }
}