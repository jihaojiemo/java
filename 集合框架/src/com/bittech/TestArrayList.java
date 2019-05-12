package com.bittech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class TestArrayList {

    public static void code1() {
        //顶层接口Collection，但是一般不会直接用它，而是用它的子接口List或者Set
        List<String> list = new ArrayList<>();

        //添加
        list.add("Java");
        list.add("C++");
        list.add(0, "PHP");
        list.add(2, "Python");
        //重复添加
        list.add("Java");
        System.out.println("原list："+list);
        System.out.println("list是否为空："+list.isEmpty());
        System.out.println("list的长度："+list.size());
        System.out.println("list是否包含PHP："+list.contains("PHP"));
        //移除
        System.out.println("list移除Java："+list.remove("java"));
        System.out.println("list移除index=0："+list.remove(0));
        System.out.println("当前的list："+list);

        //获取
        System.out.println("获取index=1的元素："+list.get(1));
        //System.out.println("获取index=10的元素："+list.get(10));//IndexOutOfBoundsException

        //遍历
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void code2() {
        //使用顶层接口Collection
        Collection<String> collection = new ArrayList<>();

        //添加
        collection.add("Java");
        collection.add("C++");
        collection.add("PHP");

        //遍历
        Object[] values = collection.toArray();
        for(Object value : values) {
            System.out.println(value);
        }

        //Object[] -> String
        System.out.println(Arrays.toString(values));
    }

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();

        /*
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(22);
        person1.setPassword("111");
        */

        Person person2 = new Person();
        person2.setName("李四");
        person2.setAge(18);
        person2.setPassword("123456");

        //添加
        //personList.add(person1);
        personList.add(new Person("张三", 22, "111"));
        personList.add(person2);

        //遍历，size是个方法，耗时，可以用以下方法代替
//        for(int i = 0; i < personList.size(); i++) {
//
//        }

        for(int i = 0, size = personList.size(); i < size; i++) {

        }

        //包含判断是否是同一个对象
        //匿名对象没办法判断是否包含
        //System.out.println("List包含person1对象吗："+personList.contains(person1));//true

        //创建了一个跟person1属性值相同的person3对象
        Person person3 = new Person();
        person3.setName("张三");
        person3.setAge(22);
        person3.setPassword("111");

        //覆写equals之后，判断的是内容 true
        System.out.println("List包含person3对象吗："+personList.contains(person3));//false
    }
}


