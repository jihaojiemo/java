package com.github.jihaojiemo.synchronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLockThread2 {

    public static void main(String[] args) {

        //lock通过构造方法传入
        final Lock lock = new ReentrantLock();
        Runnable runnable = new MyLockRunnable2(lock);
        new Thread(runnable, "ThreadA").start();
        new Thread(runnable, "ThreadB").start();
        new Thread(runnable, "ThreadC").start();

        //主线程也能用这个锁
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("main结束");
        }
    }
}

class MyLockRunnable2 implements Runnable {

    private final Lock lock;
    private int ticket = 10;

    public MyLockRunnable2(Lock lock) {
        this.lock = lock;
    }

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