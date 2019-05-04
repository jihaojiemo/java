package com.bittech;

import java.io.*;

public class TestInputStream {

    public static void main(String[] args) {

        String directory = "D:" + File.separator + "a" + File.separator + "b";
        File file = new File(directory, "test.txt");

        try(InputStream in = new FileInputStream(file)) {

            //采用缓存的方式
            byte[] buff = new byte[1024];

            int len = -1;
            while ((len = in.read(buff)) != -1) {
                System.out.print(new String(buff, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}