package com.bittech.lambda;

interface IUtil3<P1, P2, R> {
    R compare(P1 p1, P2 p2);
}

public class MethodRef3 {
    public static void main(String[] args) {
        IUtil3<Integer, Integer, Integer> iutil1 = (p1, p2) -> {
            return p1.compareTo(p2);
        };
        System.out.println(iutil1.compare(2, 1));

        System.out.println("----------");

        IUtil3<Integer, Integer, Integer> iutil2 = Integer::compareTo;
        System.out.println(iutil2.compare(2, 1));
    }
}
