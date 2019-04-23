package com.bittech;

interface INews<T> {
    void print(T t);
}

class QQ<T> implements INews<T> {
    @Override
    public void print(T t) {

    }
}

public class Test {
    public static void main(String[] args) {
        QQ<Integer> qq1 = new QQ<>();
        QQ<String> qq2 = new QQ<>();

        System.out.println(qq1.getClass() == qq2.getClass());
        System.out.println("qq1 Class:" + qq1.getClass().getName());
        System.out.println("qq2 Class:" + qq2.getClass().getName());
    }
}
