package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;

public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File file = new File("file-io-app\\src\\data.txt");
        System.out.println(file.createNewFile());
        File file1 = new File("file-io-app\\src\\data2.txt");
        System.out.println(file1.createNewFile());

        //mkdir创建一级目录
        File file2 = new File("D:\\黑马程序员\\aaa");
        System.out.println(file2.mkdir());
        File file3 = new File("D:\\黑马程序员\\aaa\\bbb\\ccc\\ddd");
        System.out.println(file3.mkdirs());
        System.out.println(file3.delete());



    }
}
