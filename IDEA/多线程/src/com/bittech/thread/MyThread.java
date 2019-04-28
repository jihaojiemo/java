package com.bittech.thread;

public class MyThread extends Thread {

    private String title;

    public MyThread(String title) {
        this.title = title;
    }

    @Override
    public void run() {

        System.out.println("run开始");//1

        for(int i = 0; i < 10; i++) {//2
            System.out.println(this.title + " " + i);
        }

        System.out.println("run结束");//3
        // 1肯定是在2和3之前运行
    }

    public static void main(String[] args) {

        System.out.println("main开始");//1

        MyThread myThread1 = new MyThread("MyThread-1");
//        MyThread myThread2 = new MyThread("MyThread-2");
//        MyThread myThread3 = new MyThread("MyThread-3");
        myThread1.start();//2
//        myThread2.start();
//        myThread3.start();

        for(int i = 0; i < 10; i++) {//3
            System.out.println("main循环" + i);
        }

        System.out.println("main结束");//4

    }
}
