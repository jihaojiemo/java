package com.github.jihaojiemo.method;

public class TestDaemon {

    public static void main(String[] args) {

        Thread threadA = new Thread(new MyDaemonRunnable(), "Thread-A");
        //创建线程默认就是用户线程
        threadA.setDaemon(true);
        //守护线程启动
        threadA.start();

        //用户线程启动
        Thread threadB = new Thread(new MyDaemonRunnable(), "Thread-B");
        threadB.start();

        //主线程休眠
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //中断，threadB结束
        threadB.interrupt();
        System.out.println("主线程结束");
    }
}

class MyDaemonRunnable implements Runnable {

    @Override
    public void run() {

        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();

                System.out.println(Thread.currentThread().getName() + "发生中断");
                break;
            }
            System.out.println("线程" + Thread.currentThread().getName() + "是否是守护线程："
                    + Thread.currentThread().isDaemon());
        }
    }
}