package com.bittech.pc;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable {

    private final Queue<Goods> queue;

    private final Integer maxCapacity = 10;

    private final AtomicInteger id = new AtomicInteger(0);

    public Producer(Queue<Goods> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this.queue) {
                if(queue.size() == maxCapacity) {
                    System.out.println(Thread.currentThread().getName() + "容器满了，等待消费");

                    try {
                        this.queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {

                    Goods good = new Goods(String.valueOf(id.getAndIncrement()), "A商品");
                    System.out.println(Thread.currentThread().getName() + "生产商品" + good);
                    this.queue.add(good);

                }
            }
        }

    }
}
