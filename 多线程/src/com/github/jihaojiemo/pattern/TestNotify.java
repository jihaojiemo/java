package com.github.jihaojiemo.pattern;

public class TestNotify {

    public static void main(String[] args) {

        final Object monitor = new Object();

        Thread threadWait = new MyWaitThread(monitor);
        threadWait.setName("Thread-wait");

        Thread threadWait2 = new MyWaitThread(monitor);
        threadWait2.setName("Thread-wait2");

        Thread threadNotify = new MyNotifyThread(monitor);
        threadNotify.setName("Thread-notify");

        threadWait.start();
        threadWait2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadNotify.start();
    }
}

class MyNotifyThread extends Thread {

    private final Object monitor;

    public MyNotifyThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        synchronized (this.monitor) {
            System.out.println(Thread.currentThread().getName() + "开始执行");

            //通知一个线程
            //this.monitor.notify();
            //通知多个线程
            this.monitor.notifyAll();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "结束执行");
        }
    }
}

class MyWaitThread extends Thread {

    private final Object monitor;

    public MyWaitThread(Object monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {

        synchronized (this.monitor) {
            System.out.println(Thread.currentThread().getName() + "开始执行");

            try {
                this.monitor.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "结束执行");
        }
    }
}