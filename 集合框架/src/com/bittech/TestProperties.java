package com.bittech;

import java.io.*;
import java.util.Properties;

public class TestProperties {

    public static void main(String[] args) {

        /*
        Properties properties = new Properties();
        properties.setProperty("Java", "Java is best");
        properties.setProperty("C++", "C++ is best too");
        System.out.println(properties.getProperty("Java"));
        System.out.println(properties.getProperty("JavaScript"));
        System.out.println(properties.getProperty("JavaScript", "JavaScript is best"));

        properties.list(System.out);
        */


        /*
        Properties properties = new Properties();
        //Properties对象关联到.properties文件
        String messageFile = "D:\\java\\IDEA\\集合框架\\src\\com\\bittech\\message.properties";

        try(Reader reader = new FileReader(messageFile)) {

            properties.load(reader);
            properties.list(System.out);

            System.out.println("==========");

            System.out.println(properties.getProperty("c"));
            System.out.println(properties.getProperty("javascript", "JavaScript语言非常重要！"));
            System.out.println(properties.size());

            //修改Properties对象
            properties.setProperty("javascript", "JavaScript很重要");
            properties.setProperty("c", "c语言不简单");

            System.out.println("==========");

            properties.list(System.out);

            try (FileWriter writer = new FileWriter(messageFile)) {
                properties.store(writer, "修改内容");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        */


        Properties properties = new Properties();

        ClassLoader classLoader = TestProperties.class.getClassLoader();

        try (InputStream in = classLoader.getResourceAsStream("D:\\java\\IDEA\\集合框架\\src\\com\\test.properties") ) {

            properties.load(in);
            properties.list(System.out);

        } catch (IOException e) {

        }

    }
}
