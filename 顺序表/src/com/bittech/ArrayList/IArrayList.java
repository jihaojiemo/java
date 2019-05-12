package com.bittech.ArrayList;

public interface IArrayList {

    //把item插入到线性表的前面
    void pushFront(int item);
    //把item插入到线性表的后面
    void pushBack(int item);
    //把item插入到index位置处，index后的数据后移
    void add(int item, int index);
    //删除前面的数据
    void popFront();
    //删除前面的数据
    void popBack();
    //删除index处的数据，index后的数据前移
    void remove(int index);
}
