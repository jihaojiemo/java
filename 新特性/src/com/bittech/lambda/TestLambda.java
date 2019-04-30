package com.bittech.lambda;

@FunctionalInterface
interface IAdd {
    int add(int a, int b);
}

@FunctionalInterface
interface IMessage {
    void print();
}

public class TestLambda {
    public static void main(String[] args) {

        //方法体只有一行语句且作为返回值，所以不需要{}和return
        IAdd iAddObject = (a, b) -> a+b;
        System.out.println(iAddObject.add(1, 2));
        System.out.println(iAddObject.add(3, 5));

        //方法体只有一行语句可以省略{}
        IMessage m1 = () -> System.out.println("Hello world");
        m1.print();

        //方法体有多行语句的时候不能省略{}
        IMessage m2 = () -> {
            System.out.println("111");
            System.out.println("222");
            System.out.println("333");
        };
        m2.print();
    }
}
