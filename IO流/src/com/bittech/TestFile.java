package com.bittech;

import java.io.File;

public class TestFile {
    public static void main(String[] args) {

        String directory = "D:" + File.separator + "a" + File.separator + "b";
        File file = new File(directory, "test.txt");

        //mkdirs连a目录和b目录一起创建
        //如果目录存在则删除，如果不存在则创建
        if(file.exists()) {
            file.delete();
        } else {
            if(file.mkdirs()) {
                System.out.println("目录创建成功");
            } else {
                System.out.println("目录创建失败");
            }
        }

    }
}