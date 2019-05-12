package com.bittech;

import java.util.*;

public class TestCollections {

    public static void main(String[] args) {

        /*
        List<String> list = new ArrayList<>();
        //批量添加
        Collections.addAll(list, "Java", "C++", "PHP");
        System.out.println(list);
        //反转
        Collections.reverse(list);
        System.out.println(list);
        //填充
        Collections.fill(list, "--");
        System.out.println(list);
        //空集合
        List<String> list1 = Collections.emptyList();
        System.out.println(list1.size());//0
        //UnsupportedOperationException
        //list1.add("Java");
        System.out.println(list1);
        */

        /*
        //线程不安全的
        //synchronizedList
        List<String> list1 = new ArrayList<>();
        List<String> list2 = Collections.synchronizedList(list1);
        System.out.println(list2.getClass().getName());

        //SynchronizedMap
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());
        System.out.println(map.getClass().getName());
        */

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 4, 6, 0, 5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

    }
}
