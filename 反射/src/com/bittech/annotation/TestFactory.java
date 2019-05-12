package com.bittech.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface MyFruit {
    Class target();
}

interface Fruit {
    void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit {
    @Override
    public void eat() {
        System.out.println("吃橘子");
    }
}

@MyFruit(target = Orange.class)
class FruitFactory {

    public static Fruit getFruit() {
        MyFruit myFruit = FruitFactory.class.getAnnotation(MyFruit.class);
        try {
            return (Fruit) myFruit.target().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class TestFactory {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruit();
        fruit.eat();
    }
}
