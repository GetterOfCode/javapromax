package com.itheima.d2_rercusion;

import java.io.File;

public class RecursionDemo02 {
    public static void main(String[] args) {
        File file = new File("D:\\peanut");
        System.out.println(searchFile(file, "shi.txt"));

    }
    public static File searchFile(File dir, String fileName){
        if(dir != null&&dir.isDirectory()){
            File[] files  = dir.listFiles();
            if(files.length>0){
                for (File file : files) {
                    if (file.getName().equals(fileName)){
                        return file;

                    }else{
                        return null;
                    }
                }
            }
        }
        return null;

    }
}
