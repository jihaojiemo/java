package com.linked;

public class Test {

    public static void main(String[] args) {


        MyLinkedListImpl linkedList = new MyLinkedListImpl();
        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(40);
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.display();
        System.out.println(linkedList.getLength());
        System.out.println(linkedList.contains(10));

    }
}
