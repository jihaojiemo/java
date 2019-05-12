package com.bittech;

import java.util.LinkedList;
import java.util.List;

public class TestLinkedList {

    public static void main(String[] args) {

        //LinkedList双向链表
        List<String> list = new LinkedList<>();
        list.add("Java");
        list.add("C++");
        list.add(1, "PHP");
        System.out.println("list的长度："+list.size());
        System.out.println("是否包含Java："+list.contains("Java"));
        System.out.println("删除C++："+list.remove("C++"));
        System.out.println(list);


    }

}
