package com.bittech;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TestPrintStream {

    public static void main(String[] args) {

        String file = "D:" + File.separator + "test"
                + File.separator + "printStream.txt";

        //字符的打印流
        try(PrintWriter writer = new PrintWriter(file)) {

            writer.write("姓名");
            writer.write("张三");
            writer.write("\n");
            writer.write(50);
            writer.write("\n");
            writer.write(new char[]{'A', 'B', 'C'});

            //链式调用
            writer.append("A").append("B").append("C");

            //格式化输出，String里面也有个格式化输出的方法， System.out.printf也是
            writer.printf("姓名：%s 年龄：%d 身高：%.2fcm \n", "张三", 22, 180.25F);
            String str = String.format("姓名：%s 年龄：%d 身高：%.2fcm", "张三", 22, 180.25F);
            writer.println(str);


            writer.flush();
        } catch(IOException e) {

        }


    }
}
