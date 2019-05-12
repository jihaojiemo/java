package com.bittech.synchronize;

public class TestSyncThread {

    public static void main(String[] args) {

        for(int i = 0; i < 10; i++) {
            Thread thread = new MySyncThread();
            thread.setName("Thread-Sync-" + i);
            thread.start();
        }
    }
}

class Sync {

    //同步Sync对象的test方法
    //多线程同一时间访问同一个Sync对象的test方法时会进行同步操作
    //同一时间只能有一个线程访问Sync对象的test方法
    public synchronized void test() {

        System.out.println("test执行开始，当前线程：" + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("test执行结束，当前线程：" + Thread.currentThread().getName());
    }
}


class MySyncThread extends Thread {

    @Override
    public void run() {
        Sync sync = new Sync();
        sync.test();
    }
}
//不对的，不是同一个Sync对象，也就不存在资源竞争