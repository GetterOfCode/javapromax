package com.itheima.d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        Reader fr = new FileReader("file-io-app/src/data2.txt");

        int len;
        while((len = fr.read())!=-1){
            System.out.print((char)len);
        }

    }
}
