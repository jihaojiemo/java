package com.github.jihaojiemo.synchronize;

/**
 *synchronized锁多对象
 */
public class TestSyncThread2 {

    public static void main(String[] args) {

        Sync2 sync = new Sync2();

        for(int i = 0; i < 10; i++) {
            Thread thread = new MySyncThread2(sync);
            thread.setName("Thread-Sync-" + i);
            thread.start();
        }
    }
}

class Sync2 {

    //同步Sync对象的test方法
    //多线程同一时间访问同一个Sync对象的test方法时会进行同步操作
    //同一时间只能有一个线程访问Sync对象的test方法
//    public synchronized void test() {
//
//        System.out.println("test执行开始，当前线程：" + Thread.currentThread().getName());
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("test执行结束，当前线程：" + Thread.currentThread().getName());
//    }


    public void test() {
        synchronized (this) {
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


class MySyncThread2 extends Thread {

    private final Sync2 sync;

    public MySyncThread2(Sync2 sync) {
        this.sync = sync;
    }


    @Override
    public void run() {
        sync.test();
    }
}
