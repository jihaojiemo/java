package com.bittech.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunction {
    public static void main(String[] args) {

        //功能型函数
        Function<Integer, String> function1 = String::valueOf;
        Function<String, Boolean> function2 = Boolean::parseBoolean;
        System.out.println(function1.apply(1));
        System.out.println(function2.apply("flase"));

        System.out.println("----------");

        //供给型函数
        Supplier<String> supplier1 = "hello"::toUpperCase;
        Supplier<Person> supplier2 = () -> {
            return new Person("张三", 22);
        };
        System.out.println(supplier1.get());
        System.out.println(supplier2.get());

        System.out.println("----------");

        //消费型函数
        Consumer<String> consumer = System.out :: println ;
        consumer.accept("hello");

        System.out.println("----------");

        //断言型函数
        Predicate<Person> predicate = (p) -> {
            return p != null;
        };
        System.out.println(predicate.test(new Person("张三", 22)));
    }
}
