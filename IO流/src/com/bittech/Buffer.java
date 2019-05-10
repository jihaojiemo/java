package com.bittech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Buffer {

    //利用BufferedReader实现键盘输入

    public static void main(String[] args) {

        //字节输入流
        InputStream inputStream = System.in;

        //字符输入流（字节流转字符流）
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        //缓冲的字符输入流
        BufferedReader reader = new BufferedReader(inputStreamReader);

        //交互式的反复输入
        while(true) {
            System.out.println("请输入名字：");
            try {
                String line = reader.readLine();
                System.out.println(line);
                if(line.equals("quit")) {
                    break;
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

    }
}
