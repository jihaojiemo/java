package com.bittech;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {

    public static void code1() {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("C++");
        set.add("JavaScript");
        set.add("PHP");
        //元素不能重复
        set.add("C++");

        System.out.println("Set的长度："+set.size());
        System.out.println("Set是否包含Java："+set.contains("Java"));
        System.out.println("Set是否包含Python："+set.contains("Python"));
        System.out.println("Set移除C++："+set.remove("C++"));
        System.out.println(set);

        //无序的
        for(String item : set) {
            System.out.println(item);
        }

    }

    public static void main(String[] args) {

        Set<Person> people = new HashSet<>();
        people.add(new Person("张三", 22, "123"));
        people.add(new Person("李四", 18, "abc"));
        people.add(new Person("张三", 22, "123"));
        System.out.println(people);
        //覆写equals输出2个对象，不覆写输出3个

    }
}
