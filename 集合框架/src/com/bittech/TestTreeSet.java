package com.bittech;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(18);
        set.add(21);
        set.add(15);
        //有序的，默认升序
        System.out.println(set);

        Set<String> set1 = new TreeSet<>();
        set1.add("Java");
        set1.add("C++");
        set1.add("PHP");
        set1.add("Python");

        //排序的第二种方式，lambda表达式
        Set<Person> set2 = new TreeSet<>((o1, o2) -> -1*o1.getAge().compareTo(o2.getAge()));
        //IDEA提示：non-comparable
        set2.add(new Person("张三", 22, "123"));
        set2.add(new Person("李四", 18, "abc"));
        set2.add(new Person("王五", 20, "123456"));


    }
}
