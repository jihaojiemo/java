package com.bittech.synchronize;

public class TestDeadThread {

    public static void main(String[] args) {

        Pen pen = new Pen();
        Book book = new Book();

        //线程A
        new Thread(() -> {
            synchronized (pen) {

                System.out.println(Thread.currentThread().getName() + "有笔没本");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //等待资源book
                synchronized (book) {

                    System.out.println(Thread.currentThread().getName() + "有笔有本");
                }
            }
        }, "Thread-A").start();


        //线程B
        new Thread(() -> {
            synchronized (book) {

                System.out.println(Thread.currentThread().getName() + "有本没笔");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //等待资源pen
                synchronized (pen) {

                    System.out.println(Thread.currentThread().getName() + "有本有笔");
                }
            }
        }, "Thread-B").start();
    }
}

class Pen {

}

class Book {

}