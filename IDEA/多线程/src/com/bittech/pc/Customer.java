package com.bittech.pc;

import java.util.Queue;

public class Customer implements Runnable {

    private final Queue<Goods> queue;

    public Customer(Queue<Goods> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this.queue) {
                if(this.queue.isEmpty()) {
                    System.out.println(Thread.currentThread().getName() + "容器已空，通知生产");
                    this.queue.notify();
                } else {
                    Goods good = this.queue.poll();
                    if(good != null) {
                        System.out.println(Thread.currentThread().getName() + "消费商品" + good);
                    }
                }
            }

        }
    }
}
