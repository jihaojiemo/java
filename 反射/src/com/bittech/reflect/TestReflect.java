package com.bittech.reflect;

import java.util.Date;

public class TestReflect {
    public static void main(String[] args) {
        Class classz = Date.class;

        //Class -> new -> object
        //Class对象创建实例化对象
        try {
            Object obj = classz.newInstance();
            //ClassCastException
            if (obj instanceof Date) {
                Date date = (Date) obj;
                System.out.println(date);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
