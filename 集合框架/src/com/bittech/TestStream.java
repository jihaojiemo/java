package com.bittech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {

        /*
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Java", "C++", "PHP");
        //函数式编程
        list.forEach(s -> System.out.println(s));
        //方法引用
        list.forEach(System.out::println);

        System.out.println("----------");

        //实例化Stream对象
        Stream<String> stream = list.stream();
        System.out.println(stream.count());
        */

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Java", "C++", "PHP", "JavaScript", "C", "PHP", "Python");

        //过滤输出元素中包含Java或者C的元素
        List<String> newList1 = list.stream()
                .filter(s -> {
                    return s.contains("Java") || s.contains("C");
                })
               .collect(Collectors.toList());
                //收集完的数据依然属于List集合，所以可以直接使用List进行接收
        System.out.println(newList1);

        //跳过多少个元素取出多少个元素（分页处理）
        List<String> newList2 = list.stream()
                .skip(2)
                .limit(3) //3
                .skip(1) //2
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(newList2);

        //综合操作
        List<String> newList3 = list.stream()
                .skip(2)
                .limit(5)
                .filter(s -> s.contains("P"))
                .collect(Collectors.toList());
        System.out.println(newList3);


    }
}
