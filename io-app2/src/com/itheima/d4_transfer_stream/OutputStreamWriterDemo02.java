package com.itheima.d4_transfer_stream;

import java.io.*;

public class OutputStreamWriterDemo02 {
    public static void main(String[] args) throws Exception{
        OutputStream os = new FileOutputStream("io-app2/src/data1.txt");

        //Writer osw = new OutputStreamWriter(os);//默认utf-8
        Writer osw1 = new OutputStreamWriter(os,"gbk");
        BufferedWriter bw = new BufferedWriter(osw1);
        bw.write("我爱中国");
        bw.write("我爱中国");
        bw.write("我爱中国");
        bw.write("我爱中国");
        bw.write("我爱中国");
        bw.close();
        InputStream is = new FileInputStream("io-app2/src/data1.txt");
        //Reader isr = new InputStreamReader(is);//默认以utf-8的形式转换成字符流
        Reader isr1 = new InputStreamReader(is,"gbk");//默认以utf-8的形式转换成字符流
        BufferedReader br = new BufferedReader(isr1);
        String line;
        while (( line = br.readLine())!=null){
            System.out.println(line);
        }

    }
}
