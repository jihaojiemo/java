package com.bittech.lambda;

//函数泛型接口
@FunctionalInterface
interface IUtil1<P, R> {
    R switchPara(P p);
}

public class MethodRef1 {
    public static void main(String[] args) {
        IUtil1<Integer, String> iutil1 = (p) -> {
            return String.valueOf(p);
        };
        System.out.println(iutil1.switchPara(1));

        System.out.println("----------");

        //方法引用
        IUtil1<Integer, String> iutil2 = String::valueOf;
        //相当于调了String.switchPara(1)
        System.out.println(iutil2.switchPara(1));
    }
}
