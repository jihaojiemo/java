package com.bittech.synchronize;

/**
 * synchronized锁类对象
 */
public class TestSyncThread3 {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            Thread thread = new MySyncThread3();
            thread.setName("Thread-Sync-" + i);
            thread.start();
        }

    }
}


class Sync3 {

    //多线程同一时间访问Sync的test方法时，方法中对Sync.class对象（同步）加锁
    public void test() {
        synchronized (Sync3.class) {

            System.out.println("test执行开始，当前线程：" + Thread.currentThread().getName());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("test执行结束，当前线程：" + Thread.currentThread().getName());
        }
    }
}

class MySyncThread3 extends Thread {

    @Override
    public void run() {
        Sync3 sync = new Sync3();
        sync.test();
    }
}