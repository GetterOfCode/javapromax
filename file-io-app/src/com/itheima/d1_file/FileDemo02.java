package com.itheima.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDemo02 {

    public static void main(String[] args) {

        File file = new File("D:\\Shining\\Image\\jj.jpg");
        System.out.println(file.getAbsolutePath());

        System.out.println(file.getPath());

        System.out.println(file.getName());

        System.out.println(file.length());
        long time = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fTime = sdf.format(time);
        System.out.println(fTime);

        System.out.println(file.isFile());//是否是文件
        System.out.println(file.isDirectory());//是否是文件夹
        System.out.println("-----------------------------");
        File file1 = new File("file-io-app\\src\\data.txt");
        System.out.println(file1.getAbsolutePath());

        System.out.println(file1.getPath());

        System.out.println(file1.getName());

        System.out.println(file1.length());
        long time1 = file1.lastModified();
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String fTime1 = sdf.format(time);
        System.out.println(fTime1);

        System.out.println(file1.isFile());//是否是文件
        System.out.println(file1.isDirectory());//是否是文件夹



    }

}
