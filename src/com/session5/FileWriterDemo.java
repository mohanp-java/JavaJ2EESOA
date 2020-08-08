package com.session5;

import java.io.*;

public class FileWriterDemo {
    public static void main(String[] args) {
        String path = "C:\\Users\\Public\\JavaJ2EESOA\\src\\com\\session5\\newFile.txt";
        String destination = "C:\\Users\\Public\\JavaJ2EESOA\\src\\com\\session5\\copiedFile.txt";

        File file = new File(path);
        File file1 = new File(destination);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            int i;
            while ((i = fileInputStream.read()) != -1) {
               fileOutputStream.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
