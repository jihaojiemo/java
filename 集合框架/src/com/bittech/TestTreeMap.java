package com.bittech;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2)*-1;
            }
        });

        map.put(1, "Java");
        map.put(3, "PHP");
        map.put(5, "C++");
        map.put(2, "C");
        map.put(4, "JavaScript");
        System.out.println(map);

    }
}
