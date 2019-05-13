package com.sequence;

import java.util.Arrays;

public class MySequenceListImpl implements ISequence {

    private Object[] array;
    private int size;

    public MySequenceListImpl(int capacity) {
        this.array = new Object[capacity];
        this.size = 0;
    }


    @Override
    public boolean add(int pos, Object data) {

        if (this.size == this.array.length) {
            this.array = Arrays.copyOf(this.array, this.array.length*2);
        }
        if (pos <0 || pos > this.size) {
            return false;
        }
        for (int i = this.size-1; i >= pos; i--) {
            this.array[i+1] = this.array[i];
        }
        this.array[pos] = data;
        this.size++;
        return true;
    }

    @Override
    public int search(Object key) {

        if (this.size == 0) {
            return -1;
        }
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(Object key) {
        if (this.size == 0) {
            return false;
        }
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object getPos(int pos) {

        if (this.size == 0) {
            return false;
        }
        return this.array[pos];
    }

    @Override
    public Object remove(Object key) {

        int index = search(key);
        for (int i = index+1; i < this.size; i++) {
            this.array[i-1] = this.array[i];
        }
        this.array[--this.size] = 0;
        return true;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void display() {

        for (int i = 0; i < this.size; i++) {
            System.out.println(this.array[i] + " ");
        }

        System.out.println();
    }

    @Override
    public void clear() {

        for (int i = 0; i < this.size; i++) {
            this.array[i] = null;
        }
    }
}
