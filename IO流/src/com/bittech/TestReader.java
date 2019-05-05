package com.bittech;

import java.io.*;

public class TestReader {

    public static void main(String[] args) {

        String directory = "D:" + File.separator + "a" + File.separator + "b";
        File file = new File(directory, "test.txt");

        try(Reader reader = new FileReader(file)) {

            System.out.println((char) reader.read());
            System.out.println((char) reader.read());

            char[] buff = new char[10];
            int len = -1;
            while ((len = reader.read(buff)) != -1) {
                System.out.print(new String(buff, 0, len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
