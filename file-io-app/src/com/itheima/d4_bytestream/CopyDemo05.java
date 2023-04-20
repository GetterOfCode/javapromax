package com.itheima.d4_bytestream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CopyDemo05 {
    public static void main(String[] args) {
        //创建一个字节输入流管道
        try {
            InputStream is = new FileInputStream("D:\\英雄时刻\\25138484\\英雄时刻_20191220-22点33分04s.avi");
            OutputStream os = new FileOutputStream("D:\\英雄时刻\\25138484\\new.avi");
            byte[] buffer = is.readAllBytes();
            os.write(buffer);
            System.out.println("复制完成了！");
            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
