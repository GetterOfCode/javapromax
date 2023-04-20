package com.itheima.d1_byte_buffer;

import java.io.*;

public class BytebufferDemo01 {
    public static void main(String[] args) {
        try(
                InputStream is = new FileInputStream("D:\\英雄时刻\\25138484\\英雄时刻_20191220-22点33分04s.avi");
                InputStream bis = new BufferedInputStream(is);//高级管道
                OutputStream os = new FileOutputStream("D:\\英雄时刻\\25138484\\new1.avi");
                OutputStream bos = new BufferedOutputStream(os);//高级管道

        ){
            byte[] buffer = bis.readAllBytes();
            bos.write(buffer);
            System.out.println("复制完成了");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
