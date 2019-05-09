package com.bittech;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestEncoding {

    public static void main(String[] args) {

        //系统GBK，程序UTF-8
        //System.getProperties().list(System.out);
        try(OutputStream out = new FileOutputStream("D:" + File.separator +
                "test" + File.separator + "encoding.txt")) {
            //乱码
            out.write("比特科技".getBytes(StandardCharsets.ISO_8859_1));//utf-8  getBytes默认转成平台编码
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
