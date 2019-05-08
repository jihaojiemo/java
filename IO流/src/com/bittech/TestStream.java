package com.bittech;

import java.io.*;

public class TestStream {

    public static void main(String[] args) {

        File file = new File("D:" + File.separator + "test.txt");

        //字节输出流转换成字符输出流
        try(OutputStream out = new FileOutputStream(file);
            OutputStreamWriter writer = new OutputStreamWriter(out)) {

            writer.write("你好Java!");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        //字节输入流转换成字符输入流
        try(InputStream in = new FileInputStream(file);
            InputStreamReader reader = new InputStreamReader(in)) {

            char[] buff = new char[1024];
            int len = -1;
            while ((len = reader.read(buff)) != -1) {
                System.out.print(new String(buff, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
