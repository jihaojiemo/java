package com.bittech;

import java.io.*;

public class SystemIO {

    public static void main(String[] args) {

        /*
        try {
            //String -> Integer
            Integer.parseInt("abc");
        } catch(NumberFormatException e) {
            //记录程序运行时的信息，通常在Java开发中不采用System.out或者System.err
            //采用日志系统  slf4j logback
            System.out.println(e.getMessage());
            System.err.println(e.getMessage());
        }


        //输出
        PrintStream printStream = System.out;
        //PrintStream是OutputStream的子类
        OutputStream out = System.out;
        try {
            out.write("hello".getBytes());
        } catch(IOException e) {
            e.printStackTrace();
        }


        //输入
        InputStream in = System.in;
        try {
            byte[] buff = new byte[5];
            int len = in.read(buff);
            System.out.println("读取了"+len+"字节， 内容是："+new String(buff, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        }
        */


        InputStream in = System.in;
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            byte[] buff = new byte[5];
            int len = -1;
            while((len = in.read(buff)) != -1) {
                out.write(buff, 0, len);
                if(len < buff.length) {
                    //已经读到最后一批
                    break;
                }
            }
            byte[] data = out.toByteArray();
            System.out.println("读取了"+data.length+"字节， 内容是："+new String(data));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
