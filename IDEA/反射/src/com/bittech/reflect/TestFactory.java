package com.bittech.reflect;

interface Fruit {
    void eat();
}

class Apple implements Fruit {
    public void eat() {
        System.out.println("吃苹果");
    }
}

class Orange implements Fruit {
    public void eat() {
        System.out.println("吃橘子");
    }
}

class FruitFactory {
    public static Fruit getFruitInstance(String fruitName) {
        try {
            Class classz = Class.forName(fruitName);
            return (Fruit) classz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}

public class TestFactory {
    public static void main(String[] args) {
        Fruit fruit = FruitFactory.getFruitInstance("www.tech.java.com.Orange");
        if (fruit != null) {
            fruit.eat();
        }
    }
}

