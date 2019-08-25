package com.github.jihaojiemo.method;

public class TestThreadFlagStop {

    public static void main(String[] args) {

        Runnable runnable = new MyRunnableStopFlag();
        Thread thread = new Thread(runnable, "Thread-flag");
        thread.start();

        //直接改成flase，有可能刚启动就被改了，所以先sleep一下
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //标记位法
        ((MyRunnableStopFlag)runnable).setFlag(false);
        //stop方法
        //thread.stop();
        System.out.println("主方法结束");

    }
}

class MyRunnableStopFlag implements Runnable {

    private boolean flag;

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        int i = 0;
        //flag默认值为flase，如果flag没有被修改则条件永远成立
        //内部可以改，外部不能改（set方法）
        while (flag) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " " + i++);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}