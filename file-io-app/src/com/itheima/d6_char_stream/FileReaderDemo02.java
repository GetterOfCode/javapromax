package com.itheima.d6_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception{
        Reader fr = new FileReader("file-io-app/src/data2.txt");
        char[] buffer = new char[1024];
        int len;
        while ((len = fr.read(buffer))!=-1){
            System.out.print(new String(buffer,0,len));

        }
    }
}
