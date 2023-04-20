package com.itheima.d1_file;

import java.io.File;

public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("D:/黑马程序员");
        //System.out.println(file.list());
        //String[] list = file.list();
        File[] files = file.listFiles();
       /* for (File file1 : files) {
            if(file1.isDirectory()){

            }

        }*/
    }

}
