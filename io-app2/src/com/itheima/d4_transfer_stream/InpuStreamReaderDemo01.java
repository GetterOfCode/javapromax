package com.itheima.d4_transfer_stream;

import java.io.*;

public class InpuStreamReaderDemo01 {
    public static void main(String[] args) throws  Exception{
        InputStream is = new FileInputStream("io-app2/src/csb2.txt");
        //Reader isr = new InputStreamReader(is);//默认以utf-8的形式转换成字符流
        Reader isr1 = new InputStreamReader(is,"gbk");//默认以utf-8的形式转换成字符流
        BufferedReader br = new BufferedReader(isr1);
        String line;
        while (( line = br.readLine())!=null){
            System.out.println(line);
        }
    }
}
