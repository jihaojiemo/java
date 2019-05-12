package com.bittech;

import java.util.Hashtable;
import java.util.Map;

public class TestHashtable {

    public static void main(String[] args) {

        Map<Integer, String> map = new Hashtable<>();
        map.put(1, "Java");
        map.put(2, "C");
        //map.put(null, "PHP");
        //map.put(8, null);

        System.out.println(map);

    }
}
