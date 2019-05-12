package com.bittech.method;

public class TestThreadName2 {

    public static void main(String[] args) {

        //1. 继承Thread类
//        for(int i =0; i < 5; i++) {
//
//            new MyThreadName2("MyThread-" + i).start();
//        }
//
//        Thread thread = new MyThreadName2("Thread-Print");
//        thread.start();

        //2. 使用Runnable（lambda表达式方式）
        Thread thread = new Thread(() -> {
            int n = 100;
            int sum = (n+1)*n/2;
            System.out.println(Thread.currentThread().getName() + " 计算结果 " + sum);
        }, "Thread-Computer-高斯函数");

        thread.start();

        //java程序启动之后，JVM进程创建了一个线程作为程序入口，即主线程（main线程）
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());

    }
}

class MyThreadName2 extends Thread {

    public MyThreadName2(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}