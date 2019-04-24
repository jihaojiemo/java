package com.bittech.lambda;

@FunctionalInterface
interface IUtil2<R> {
    R convert();
}

public class MethodRef2 {
    public static void main(String[] args) {
        String str = "hello";

        IUtil2 iutil1 = () -> {
            return str.toUpperCase();
        };
        System.out.println(iutil1.convert());

        System.out.println("----------");

        IUtil2<String> iutil2 = str::toUpperCase;
        System.out.println(iutil2.convert());
    }
}
