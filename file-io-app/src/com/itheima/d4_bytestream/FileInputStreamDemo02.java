package com.itheima.d4_bytestream;

import java.io.FileInputStream;

import java.io.InputStream;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("file-io-app\\src\\data2.txt");

        byte[] buffer = new byte[3];
        int r1 = is.read(buffer);
        System.out.println(r1);
        String str1 = new String(buffer);
        System.out.println(str1);

        int r2 = is.read(buffer);
        System.out.println(new String(buffer));
    }
}
