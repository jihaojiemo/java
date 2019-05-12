package com.bittech.synchronize;

public class TestRepeatThread {

    public static final Object lock = new Object();

    //什么时候才会对lock完全释放？
    public static void test() {
        System.out.println("test开始");

        synchronized (lock) {
            System.out.println("此处执行100行代码");
            synchronized (lock) {
                System.out.println("此处执行100行代码");
            }
        }
        System.out.println("test结束");
    }
}
