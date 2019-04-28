package com.bittech;

public class Point2<T> {

    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        //JDK1.7 泛型类实例化对象时构造方法调用这里<>不需要指定类型
        Point2<Integer> p1 = new Point2<>();
        p1.setX(10);
        p1.setY(20);
        System.out.println(p1);

        Point2<String> p2 = new Point2<>();
        p2.setX("东经20度");
        p2.setY("北纬80度");
        System.out.println(p2);
    }
}
