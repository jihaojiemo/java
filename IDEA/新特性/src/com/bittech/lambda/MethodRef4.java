package com.bittech.lambda;

@FunctionalInterface
interface IUtil4<P1, P2, R> {
    R createObject(P1 p1, P2 p2);
}

class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MethodRef4 {
    public static void main(String[] args) {
        IUtil4<String, Integer, Person> iutil1 = (s, i) -> {
            return new Person(s, i);
        };
        System.out.println(iutil1.createObject("张三", 22));

        System.out.println("----------");

        IUtil4<String, Integer, Person> iutil2 = Person::new;
        System.out.println(iutil2.createObject("张三", 22));
    }
}
