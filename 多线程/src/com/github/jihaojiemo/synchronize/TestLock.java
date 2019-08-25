package com.github.jihaojiemo.synchronize;

public class TestLock {

    //public static StringBuffer sb = new StringBuffer();
    //锁的粗化：1次加锁，1次解锁
//    public static StringBuilder sb = new StringBuilder();
//
//    public static void main(String[] args) {
//
//        synchronized (sb) {
//            sb.append("a");
//            sb.append("b");
//            sb.append("c");
//        }

    //锁的消除：只会被一个线程访问
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
    }

}
