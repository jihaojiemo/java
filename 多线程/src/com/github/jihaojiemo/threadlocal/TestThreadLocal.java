package com.github.jihaojiemo.threadlocal;

public class TestThreadLocal {

    private static String strValue;//null
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        strValue = "main线程修改";
        threadLocal.set("main线程修改");

        new Thread(() -> {

            strValue = "Thread-A修改";
            threadLocal.set("Thread-A修改");
            System.out.println(Thread.currentThread().getName() + " " + threadLocal.get());

        }, "Thread-A").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //mian和Thread-A同时访问strValue和threadLocal
        System.out.println(strValue);
        System.out.println(threadLocal.get());

    }
}
