package com.bittech;

import java.io.*;

//将字符串中的字符转换成大写，要求使用内存流
public class TestMemoryStream {

    public static void main(String[] args) {

        String message = "hello world";
        byte[] messageBytes = message.getBytes();

        //内存操作，不需要捕获异常
        //in out 都是内存流，数据都存在内存中
        ByteArrayInputStream in = new ByteArrayInputStream(messageBytes);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        try {
            int c = -1;
            while((c = in.read()) != -1) {
                //转大写
                c = c-32;
                out.write(c);
            }
            out.flush();

            //输出流里面没有把输出流变成字节数组的方法，是ByteArray里面有的
            //byte[] newMessage = ((ByteArrayOutputStream) out).toByteArray();
            byte[] newMessage = out.toByteArray();
            System.out.println(new String(newMessage));


        } catch (IOException e) {

        }
    }
}
