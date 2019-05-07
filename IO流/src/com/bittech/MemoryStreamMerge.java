package com.bittech;

import java.io.*;

public class MemoryStreamMerge {

    public static void main(String[] args) {

        //data-1.txt + data-2.txt = data.txt

        /*
         * 方案一：做项目用的多，适合大文件
         * 1. data-1.txt 内容复制到 data.txt
         * 2. data-2.txt 内容复制追加到 data.txt
         *
         * 方案二：适合小文件
         * 1. data-1.txt 复制到内存的输出流
         * 2. data-2.txt 复制到内存的输出流
         * 3. 内存的输出流 -> byte[]字节流
         * 4. byte[] -> 输出到文件的输出流
         */

        File part1 = new File("D:" + File.separator + "test" + File.separator + "data-1.txt");
        File part2 = new File("D:" + File.separator + "test" + File.separator + "data-2.txt");
        File part = new File("D:" + File.separator + "test" + File.separator + "data.txt");

        try(FileInputStream in1 = new FileInputStream(part1);
            FileInputStream in2 = new FileInputStream(part2);
            ByteArrayOutputStream out1 = new ByteArrayOutputStream();
            FileOutputStream out2 = new FileOutputStream(part)
        ) {

            byte[] buff = new byte[1024];
            int len = -1;
            while((len = in1.read(buff)) != -1) {
                out1.write(buff, 0, len);
            }
            while((len = in2.read(buff)) != -1) {
                out1.write(buff, 0, len);
            }
            out1.flush();

            byte[] data = out1.toByteArray();
            out2.write(data);
            out2.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
