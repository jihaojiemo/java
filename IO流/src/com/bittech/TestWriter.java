package com.bittech;

import java.io.*;

public class TestWriter {

    public static void main(String[] args) {

        String directory = "D:" + File.separator + "a" + File.separator + "b";
        File file = new File(directory, "test.txt");

        try(Writer writer = new FileWriter(file)) {

            writer.write("Java is best!");
            writer.write("\n");
            writer.write(65);
            writer.write("\n");
            writer.write(new char[]{'A', 'B', 'C'});
            writer.write("\n");
            writer.append("Hello World");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}