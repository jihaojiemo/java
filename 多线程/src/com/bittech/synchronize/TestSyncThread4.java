package com.bittech.synchronize;

/**
 * synchronized锁任意对象
 */
public class TestSyncThread4 {

    public static void main(String[] args) {

        final Object lock = new Object();
        for(int i = 0; i < 10; i++) {
            Thread thread = new MySyncThread4(lock);
            thread.setName("Thread-Sync-" + i);
            thread.start();
        }
    }
}

class Sync4 {

    private final Object lock;

    public Sync4(Object lock) {
        this.lock = lock;
    }

    //多线程同一时间访问Sync的test方法时，方法中对任意的实例化对象加锁
    public void test() {
        synchronized (lock) {

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

class MySyncThread4 extends Thread {

    private final Object lock;

    MySyncThread4(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Sync4 sync = new Sync4(lock);
        sync.test();
    }
}