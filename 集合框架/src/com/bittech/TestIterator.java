package com.bittech;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("C++");
        list.add("PHP");
        list.add("Python");
        list.add("JavaScript");

        /*
        Iterator<String> iterator = list.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);

            if(element.startsWith("Java")) {
                iterator.remove();
            }
            System.out.println(element);
        }
        */

        /*
        //ConcurrentModificationException  并发修改异常
        for(String element : list) {
            if(element.startsWith("Java")) {
                list.remove(element);
            }
        }
        System.out.println(list);
        */

        System.out.println("原始的list："+list);
        ListIterator<String> listIterator = list.listIterator();

        System.out.print("从前往后：");
        while(listIterator.hasNext()) {
            System.out.print(listIterator.next() + "->");
        }

        System.out.println();

        System.out.print("从后往前：");
        while(listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + "<-");
        }



    }
}
