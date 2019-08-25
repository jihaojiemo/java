package com.github.jihaojiemo.method;

public class TestJoin {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + "开始执行");

        Runnable runnable = new MyJoinRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        //目标：让（main方法执行结束）一定要在最后执行
        try {
            //等待线程Thread执行完毕
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(Thread.currentThread().getName() + "执行完毕");
    }
}

class MyJoinRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName() + "开始执行");

        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + "执行完毕");
    }
}