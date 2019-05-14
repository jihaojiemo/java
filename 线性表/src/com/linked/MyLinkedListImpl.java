package com.linked;

public class MyLinkedListImpl implements ILinked {


    class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    public MyLinkedListImpl() {
        this.head = null;
    }

    @Override
    public void addFirst(int data) {

        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }

    @Override
    public void addLast(int data) {

        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;

    }


//    //寻找index-1位置的节点
//    public Node searchIndex(int index) {
//        if (index < 0 || index > getLength()) {
//            throw new UnsupportedOperationException("index位置不合法");
//        }
//        int count = 0;
//        Node cur = this.head;
//        while (count < index-1) {
//            cur = cur.next;
//            count++;
//        }
//        return cur;
//    }


    @Override
    public boolean addindex(int index, int data) {

        if (index < 0 || index > getLength()) {
            throw new Error();
        }
        if (index == 0) {
            addFirst(index);
            return true;
        }

        Node node = new Node(data);
        Node cur = this.head;
        for (int i = 0; i < index-1; i++) {
            cur = cur.next;
        }
        node.next = cur.next;
        cur.next = node;
        return true;
    }

    @Override
    public boolean contains(int key) {

        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }

        return false;
    }


    //寻找要删除的节点的前一个节点
    public Node searchPre(int key) {

        if (this.head.data == key) {
            return this.head;
        }
        Node pre = this.head;
        while (pre.next != null) {
            if (pre.next.data == key) {
                return pre;
            }
            pre = pre.next;
        }
        return pre;
    }


    @Override
    public int remove(int key) {

        int oldData = 0;
        Node pre = searchPre(key);

        //空链表
        if (this.head == null) {
            throw new Error();
        }

        //表示没有找到要删除的值
        if (pre == null) {
            throw new Error();
        }

        //如果删除的是第一个节点
        if (pre == this.head && pre.data == key) {
            oldData = this.head.data;
            this.head = this.head.next;
            return oldData;
        }

        //如果删除的不是第一个节点
        pre.next = pre.next.next;
        return oldData;
    }

    @Override
    public void removeAllKey(int key) {

        if (this.head == null) {
            throw new Error();
        }

        Node pre = this.head;
        Node cur = this.head.next;

        while (cur != null) {
            if (cur.data == key) {
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = cur;
                cur = cur.next;
            }
        }

        //如果删除的是第一个节点
        if (this.head.data == key) {
            this.head = this.head.next;
        }
    }

    @Override
    public int getLength() {

        int i = 0;
        while (this.head != null) {
            this.head = this.head.next;
            i++;
        }
        return i;
    }

    @Override
    public void display() {

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    @Override
    public void clear() {

        while (this.head != null) {
            Node cur = this.head.next;
            this.head = cur.next;
        }
        this.head = null;
    }
}
