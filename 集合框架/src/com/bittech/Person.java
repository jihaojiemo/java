package com.bittech;

import java.util.Objects;

//TreeSet排序时添加Comparable
public class Person implements Comparable<Person> {

    private String name;
    private Integer age;
    private transient String password;

    //自定义Person类时再加
    public Person() {
    }

    public Person(String name, Integer age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }


    //包含再添加，判断内容是否相等
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) &&
                age.equals(person.age) &&
                password.equals(person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, password);
    }

    @Override
    //比较方法（TreeSet时加入）
    public int compareTo(Person o) {
        //this  当前对象
        //o  进行比较的对象
        //对Person集合进行排序，排序规则
        //1. 按照年龄升序排列
        //return this.age - o.getAge();
        //2. 按照年龄降序排列
        //return -1*(this.age - o.getAge())*(-1);
        //3. 按照密码长度升序排序
        return this.password.length() - o.getPassword().length();
        //但是这种方式不太灵活，希望在用的时候再决定怎么排序

    }
}
