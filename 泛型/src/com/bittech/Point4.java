package com.bittech;

public class Point4 {

    //泛型方法
    public <T> void print(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        new Point4().print("Hello");
        new Point4().print(22);
    }
}
