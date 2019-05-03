package com.bittech.serializable;

import java.io.*;

class Person implements Serializable {

    private String name;
    private Integer age;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class TestSerializable {

    public static void code1() {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(22);
        System.out.println("person1："+person1);

        //序列化
        //Java Object  ->  byte[]
        //可以写到file或者byte[]里面
        try(ByteArrayOutputStream stream = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(stream)
        ) {

            out.writeObject(person1);
            out.flush();
            //data对象变成的二进制流
            byte[] data = stream.toByteArray();

            //反序列化
            //byte[] -> java Object
            try(ByteArrayInputStream instream = new ByteArrayInputStream(data);
                ObjectInputStream in = new ObjectInputStream(instream)
            ) {

                Object returnValue = in.readObject();
                System.out.println(returnValue.getClass());

                Person person2 = (Person) returnValue;
                System.out.println("Person2：" + person2);

                //前者Person1是通过实例化new出来的，在堆上分配出来的
                //后者person2是通过二进制流变成的Java对象
                System.out.println(person1 == person2);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void code2() {
        Person person1 = new Person();
        person1.setName("张三");
        person1.setAge(22);

        //传输，通过文件
        try(FileOutputStream stream = new FileOutputStream("D:" + File.separator + "test" + File.separator + "person.obj");
            ObjectOutputStream out = new ObjectOutputStream(stream)
        ) {

            out.writeObject(person1);
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        //传输，通过文件
        try(FileInputStream stream = new FileInputStream("D:" + File.separator + "person.obj");
            ObjectInputStream in = new ObjectInputStream(stream)
        ) {

            Object returnValue = in.readObject();
            Person person = (Person) returnValue;
            System.out.println(person);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
