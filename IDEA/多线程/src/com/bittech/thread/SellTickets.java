package com.bittech.thread;

public class SellTickets {

    public static void main(String[] args) {

        //ticket是个成员属性，每个对象都有它的成员属性，要想数据共享，改成静态属性
//        Thread thread1 = new MyThread3();
//        Thread thread2 = new MyThread3();
//        Thread thread3 = new MyThread3();
//        thread1.start();
//        thread2.start();
//        thread3.start();

        Runnable runnable = new MyRunnable3();
        //多线程共享同一个对象
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

//
//class MyThread3 extends Thread {
//
//    private static int ticket = 10;
//
//    public void run() {
//        while(ticket > 0) {
//            System.out.println("剩余："+ --ticket + "张票");
//        }
//    }
//
//}

class MyRunnable3 implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        while(this.ticket > 0) {
            System.out.println("剩余："+ --this.ticket + "张票");
        }
    }
}