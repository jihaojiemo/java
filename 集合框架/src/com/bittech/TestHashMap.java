package com.bittech;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

    public static void main(String[] args) {

        /*
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "C");
        map.put(3, "JavaScript");
        map.put(4, "C++");
        map.put(5, "Python");
        map.put(6, "SQL");
        map.put(null, "SQL");


        //k不能重复，但是可以为 null；value可以重复，也可以为null

        System.out.println("Map的元素个数："+map.size());
        System.out.println("Map的key=3的值："+map.get(3));
        System.out.println("Map的key=7的值："+map.get(7));
        System.out.println("Map是否包含key=2的值："+map.containsKey(2));

        System.out.println(map.keySet());
        System.out.println(map.values());


        System.out.println("Map的遍历方式：");

        for(Integer key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("----------");

        for(String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("----------");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("----------");

        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
        */

        Map<Person, String> map = new HashMap<>();
        map.put(new Person("Jack", 22, "123"), "hello Jack");

        System.out.println(map.containsKey(new Person("Jack", 22, "123")));

    }
}
