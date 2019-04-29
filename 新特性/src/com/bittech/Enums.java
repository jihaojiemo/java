package com.bittech;

class Person {

    private String name;
    private Integer age;
    private Gender gender;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

enum Gender {

    //实际开发中需要根据业务情况决定此处枚举对象的数量
    MALE("男"),
    FEMALE("女");

    private String flag;

    //构造方法
    Gender(String flag) {
        this.flag = flag;
    }

    public String getFlag() {
        return flag;
    }
}

public class Enums {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Jack");
        person.setAge(21);
        person.setGender(Gender.MALE);

        System.out.println(person);

        switch (person.getGender()) {
            case MALE:
                System.out.println("男同志");
                break;
            case FEMALE:
                System.out.println("女同胞");
            default:
                System.out.println("未知");
        }
    }
}
