package com.itheima.d4_bytestream;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo01  {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream(new File("file-io-app\\src\\data.txt"));//管道

        /*int r1 = is.read();
        System.out.println((char)r1);

        int r2 = is.read();
        System.out.println((char) r2);
        int r3 = is.read();
        System.out.println((char) r3);

        int r4 = is.read();//读完返回-1
        System.out.println(r4);*/
        int b;
        while ((b=is.read())!=-1){
            System.out.print((char)b);
        }

    }
}
