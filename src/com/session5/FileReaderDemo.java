package com.session5;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Public\\JavaJ2EESOA\\src\\com\\session5\\newFile.txt";
        File file = new File(path);
        if(file.exists()) {
            System.out.println("File found");
        } else {
            System.out.println("File not found");
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);//Explicit Typecasting/Narrowing
        }
        System.out.println();

    }
}
