package com.bittech.synchronize;

public class TestTicketThread2 {

    public static void main(String[] args) {

        Runnable runnable = new MyTicketRunnable2();
        new Thread(runnable, "Thread-A").start();
        new Thread(runnable, "Thread-B").start();
        new Thread(runnable, "Thread-C").start();
    }
}

class MyTicketRunnable2 implements Runnable {

    private int ticket = 10;

//    @Override
//    public synchronized void run() {
//        while (this.ticket > 0) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//            System.out.println(Thread.currentThread().getName() + "买票，剩余" + --this.ticket);
//        }
//    }


    @Override
    public void run() {
        while (this.ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.sale();
        }
    }

    //sale是MyTicketRunnable2对象的方法，给对象加锁
    public synchronized void sale() {

        if(this.ticket > 0) {

            System.out.println(Thread.currentThread().getName() + "买票，剩余" + --this.ticket);
        }
    }

    //静态方法属于类的，给MyTicketRunnable2的class对象加锁
    public synchronized static void print() {

    }
}
