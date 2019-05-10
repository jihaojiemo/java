package com.bittech;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");
        if(scanner.hasNext()) {
            System.out.println("输入的内容："+scanner.next());
        }


        System.out.println("请输入年龄：");
        if(scanner.hasNextInt()) {
            System.out.println("输入的内容是int");
        } else {
            System.out.println("输入的内容不是int");
        }


        //正则表达式
        System.out.println("请输入生日：");
        if(scanner.hasNext("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("输入的内容："+scanner.next());
        } else {
            System.out.println("输入的内容不是生日格式");

        }
        */



        //读取文件（针对字符）
        try(Scanner scanner = new Scanner(Paths.get("D:", "test", "data.txt"))) {
            //比File.separater更方便

            scanner.useDelimiter("\n");
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
