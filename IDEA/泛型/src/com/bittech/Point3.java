package com.bittech;

public class Point3<T,E> {

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

    @Override
    public String toString() {
        return "Point3{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point3<Integer,Integer> p1 = new Point3<>();
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1);

        Point3<Integer,String> p2 = new Point3<>();
        p2.setX(80);
        p2.setY("北纬20度");
        System.out.println(p2);
    }
}
