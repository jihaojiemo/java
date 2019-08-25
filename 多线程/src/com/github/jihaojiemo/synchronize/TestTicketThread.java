package com.github.jihaojiemo.synchronize;

public class TestTicketThread {

    public static void main(String[] args) {

        Runnable runnable = new MyTicketRunnable();
        new Thread(runnable, "Thread-A").start();
        new Thread(runnable, "Thread-B").start();
        new Thread(runnable, "Thread-C").start();
    }
}

class MyTicketRunnable implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {

        while (this.ticket > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //多线程现在共享Runnable对象，把Runnable当做一把锁
            //同步代码块
            synchronized (this) {
                if(this.ticket > 0) {

                    System.out.println(Thread.currentThread().getName() + "买票，剩余" + --this.ticket);
                }
            }
        }
    }
}

