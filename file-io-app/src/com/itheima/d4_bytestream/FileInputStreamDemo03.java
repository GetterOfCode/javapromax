package com.itheima.d4_bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        File f = new File("file-io-app\\src\\data2.txt");
        InputStream is = new FileInputStream(f);

        /*byte[] buffer = new byte[(int) f.length()];
        int r = is.read(buffer);
        System.out.println(new String(buffer));*/



        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
