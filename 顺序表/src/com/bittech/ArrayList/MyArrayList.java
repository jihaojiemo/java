package com.bittech.ArrayList;

public class MyArrayList implements IArrayList {

    //保存数据的空间
    private int[] array;
    //保存的有效数据个数
    private int size;

    public MyArrayList(int capacity) {
        this.array = new int[capacity];
        this.size = 0;
    }

    //O(n)
    @Override
    public void pushFront(int item) {
        ensureCapacity();
        if(this.size == 0) {
            throw new Error();
        }
        //把已有的数据全部后移一位
        for(int i = this.size-1; i >= 0; i--) {
            this.array[i+1] = this.array[i];
        }
        this.array[0] = item;
        this.size++;
    }

    //O(1)
    @Override
    public void pushBack(int item) {
        ensureCapacity();
        this.array[this.size] = item;
        this.size++;
    }

    //O(n)
    @Override
    public void add(int item, int index) {

        if(index < 0 || index > this.size) {
            throw new Error();
        }

        ensureCapacity();
        for(int i = size-1; i >= index; i--) {
            this.array[i+1] = this.array[i];
        }
        this.array[index] = item;
        this.size++;
    }

    //O(n)
    @Override
    public void popFront() {
        if(this.size == 0) {
            throw new Error();
        }
        for(int i = 1; i <= this.size-1; i++) {
            this.array[i-1] = this.array[i];
        }
        this.array[--this.size] = 0;
    }

    //O(1)
    @Override
    public void popBack() {
        if(this.size == 0) {
            throw new Error();
        }
        this.array[--this.size] = 0;
    }

    @Override
    public void remove(int index) {
        if(index < 0 || index >= this.size) {
            throw new Error();
        }
        if(this.size == 0) {
            return;
        }
        for(int i = index+1; i <= this.size-1; i++) {
            this.array[i-1] = this.array[i];
        }
        this.array[--this.size] = 0;
    }


    //保证数组容量够用
    private void ensureCapacity() {
        if(this.size < this.array.length) {
            return;
        }

        //先找新房子
        int capacity = this.array.length*2;
        int[] newArray = new int[capacity];

        //搬家
        for(int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }

        //退掉老房子
        this.array = newArray;
    }

}
