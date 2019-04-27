package com.bittech.reflect;

import java.lang.reflect.Field;

class Person {

    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {

    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "school='" + school + '\'' +
                "} " + super.toString();
    }
}

public class TestBaseInfo {
    public static void main(String[] args) {

        //先要实例化对象
        Student student = new Student();
        student.setSchool("清华");
        student.setName("Jack");
        student.setAge(22);
        Class studentClass = student.getClass();

        //获取父类中的所有属性
        Field[] fields = studentClass.getFields();
        for(Field f : fields) {
            System.out.println(f.getName());
        }

        //获取父类中的age属性
        try {
            Field ageField = studentClass.getField("age");
            System.out.println(ageField.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("----------");

        //获取本类中的所有属性
        Field[] fields1 = studentClass.getDeclaredFields();
        for(Field f : fields1) {
            System.out.println(f.getName());
        }

        //获取本类中的school属性
        try {
            Field schoolField = studentClass.getDeclaredField("school");
            System.out.println(schoolField.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}