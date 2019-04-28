package com.bittech;

public class Point5<T, E> {

    private T x;
    private E y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }

    public <T> T print(T o) {
        System.out.println(o);
        return o;
    }

    @Override
    public String toString() {
        return "Point5{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        //<T,E>
        Point5<Integer, String> p = new Point5<>();
        //<T>
        p.print(250);
        p.print("嗯呐");
    }
}
