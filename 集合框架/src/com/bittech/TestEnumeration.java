package com.bittech;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumeration {

    public static void main(String[] args) {

        //属于Vector里面的方法，如果是List就用不了了
        Vector<String> vector = new Vector<>();

        vector.add("Java");
        vector.add("C++");
        vector.add("PHP");
        vector.add("Python");
        vector.add("JavaScript");

        //建议不再使用，优先使用Iterator
        Enumeration<String> enumeration = vector.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }


    }
}
