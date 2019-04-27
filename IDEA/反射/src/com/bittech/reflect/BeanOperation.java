package com.bittech.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Emp {

    private String ename;
    private String job;
    private String skill;

    public String getName() {
        return ename;
    }

    public void setName(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", skill='" + skill + '\'' +
                '}';
    }
}

public class BeanOperation {

    public static void main(String[] args) {

        String line = "name:Jack|job:SoftDev|skill:Java";
        Emp emp = new Emp();

        String[] attributes = line.split("\\|");
        for(String kv : attributes) {
            setXxx(emp, kv);
        }

        System.out.println(emp);
    }

    //object：进行赋值的对象    kv：属性和值
    public static void setXxx(Object object, String kv) {

        //1.获取指定的Class对象
        Class classz = object.getClass();

        //2.解析kv
        String[] segments = kv.split(":");
        String attribute = segments[0];
        String attributeValue = segments[1];

        //3.setXxx方法名称：set+属性名首字母大写
        String methodName = "set" + attribute.substring(0, 1).toUpperCase()
                + ((attribute.length() > 1) ? attribute.substring(1) : "");



        try {

            //4.通过反射获取setter方法
            Method method = classz.getDeclaredMethod(methodName, String.class);

            //5.通过method对象调用方法
            method.invoke(object, attributeValue);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
