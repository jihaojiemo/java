package com.bittech;

import java.io.*;

public class TestOutputStream {
    public static void main(String[] args) {

        String directory = "D:" + File.separator + "a" + File.separator + "b";
        File file = new File(directory, "test.txt");

        OutputStream out = null;

        try {

            out = new FileOutputStream(file);


            //将给定的字节数组内容全部输出
            out.write("Java is best".getBytes());

            //单个字节
            out.write("\n".getBytes());

            //ASCII int
            out.write(49);

            //将部分字节数组内容输出
            byte[] buff = "HelloWorld".getBytes();
            out.write(buff, 2, 5);

            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}