package com.github.jihaojiemo.method;

public class TestPriority {

    public static void main(String[] args) {
//
//        Thread thread1 = new MyPriorityThread();
//        thread1.setName("Thread-1");
//        //thread1.setPriority(Thread.MAX_PRIORITY);
//        thread1.start();
//
//        Thread thread2 = new MyPriorityThread();
//        thread2.setName("Thread-2");
//        //thread2.setPriority(Thread.NORM_PRIORITY);
//        thread2.start();

        Thread thread3 = new MyPriorityThread();
        thread3.setName("Thread-3");
        //thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();

        System.out.println("main线程的优先级是：" + Thread.currentThread().getPriority());
    }
}

class MyPriorityThread extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + this.getPriority());

            //在线程里再创建一个线程，优先级具备继承性
            Thread thread = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " "
                        + Thread.currentThread().getPriority());
                }, Thread.currentThread().getName() + i);
            thread.start();
        }
    }
}