package com.bittech.method;

public class TestThreadInterrupt {

    public static void main(String[] args) {


        Runnable runnable = new MyRunnableInterrupt();
        Thread thread = new Thread(runnable, "Thread-flag");
        thread.start();

        //直接改成flase，有可能刚启动就被改了，所以先sleep一下
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Thread类的interrupt方法
        thread.interrupt();
        System.out.println("主方法结束");
    }
}

class MyRunnableInterrupt implements Runnable {

    private boolean flag;

    @Override
    public void run() {
        int i = 0;

        while (flag) {
            try {
                Thread.sleep(500);

                //判断当前线程是否中断
                boolean bool = Thread.currentThread().isInterrupted();
                if(bool) {
                    System.out.println("非阻塞状态" + bool);
                    //通过中断的状态自己来决定如何处理程序（break、return）
                    break;
                }

                System.out.println(Thread.currentThread().getName() + " " + i++);
            } catch (InterruptedException e) {
                e.printStackTrace();//sleep中断

                boolean bool = Thread.currentThread().isInterrupted();
                System.out.println(bool);
                return;
            }
        }
    }

}
