package com.bittech.pc;

import java.util.LinkedList;
import java.util.Queue;

public class TestProducerCustomer {

    public static void main(String[] args) {

        final Queue<Goods> queue = new LinkedList<>();
        final Runnable producer = new Producer(queue);
        final Runnable customer = new Customer(queue);

        for(int i = 0; i < 5; i++) {
            new Thread(producer, "Thread-producer-" + i).start();
        }

        for(int i = 0; i < 8; i++) {
            new Thread(customer, "Thread-customer-" + i).start();
        }
    }
}
