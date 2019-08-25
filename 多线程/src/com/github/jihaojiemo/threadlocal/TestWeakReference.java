package com.github.jihaojiemo.threadlocal;

import java.lang.ref.WeakReference;

public class TestWeakReference {

    public static void main(String[] args) {

        //弱引用
        String abc = new String("abc");
        WeakReference<String> weakReference = new WeakReference<>(abc);
        System.out.println(weakReference.get());
    }
}
