package com.bittech.threadlocal;

public class TestThreadLocal2 {

    private static String strValue2;//null
    private static ThreadLocal<String> threadLocal2 = ThreadLocal.withInitial(() -> "默认值");

    public static void main(String[] args) {

        strValue2 = "main线程修改";
        threadLocal2.set("main线程修改");

        new Thread(() -> {

            strValue2 = "Thread-A修改";
            //threadLocal2.set("Thread-A修改");
            System.out.println(Thread.currentThread().getName() + " " + threadLocal2.get());
        }, "Thread-A").start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        //mian和Thread-A同时访问strValue和threadLocal
        System.out.println(strValue2);
        System.out.println(threadLocal2.get());
        //移除
        threadLocal2.remove();
        System.out.println(threadLocal2.get());
    }
}

