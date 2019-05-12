package com.bittech.annotation;

import java.lang.annotation.*;

/*
自定义Annotation定义：
1. 注解是接口interface修饰，并且interface前加@
2. 定义抽象方法(可选)，提供默认值，如果不提供使用时就得设置值
3. 注意保存范围和作用位置
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
@interface MyAnnotation {
    String name() default "Tom";
    int age() default 22;
}

@Deprecated
@SuppressWarnings(value = "unused")
public class TestAnnotation {
    public static void main(String[] args) {
        MyAnnotation myAnnotation=TestAnnotation.class.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.name() + " " + myAnnotation.age());
    }
}
