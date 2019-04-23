package com.bittech;

public class Point1 {

    private Object x;
    private Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point1{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public static void main(String[] args) {
        Point1 p = new Point1();
        p.setX(10);
        p.setY("北纬20度");
        //向下转型类型判断
        if(p.getX() instanceof String) {
            String x1 = (String) p.getX();
        } else {
            throw new ClassCastException("Point X type not be String");
        }
        String y1 = (String) p.getY();
        System.out.println(p);
    }
}