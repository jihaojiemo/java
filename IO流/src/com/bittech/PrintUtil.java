package com.bittech;

import java.io.*;

/**
 * 目的：为了OutputStream的输出更加简单
 * 代理模式，但是不完全遵循
 * 代码复用性强
 */
public class PrintUtil {

    private final OutputStream out;

    public PrintUtil(OutputStream out) {
        this.out = out;
    }

    public void print(String value) {
        try {
            this.out.write(value.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void println(String value) {
        this.print(value);
        try {
            this.out.write((int)'\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print(int value) {
        this.println(String.valueOf(value));
    }

    public static void main(String[] args) {
        try(FileOutputStream out = new FileOutputStream("D:" + File.separator + "test"
                + File.separator + "printutil.txt")
        ) {

            PrintUtil printUtil = new PrintUtil(out);
            printUtil.print("hello");
            printUtil.print(" world");
            printUtil.print(22);
            printUtil.print(10);
            /*
             * hello world
             * 22
             * 10
             */

        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
