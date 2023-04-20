package com.itheima.d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderDemo01 {
    public static void main(String[] args) {
        try(
                Reader fr = new FileReader("io-app2/src/data.txt");
                BufferedReader bfr = new BufferedReader(fr);
                ){
            String line;
           while((line = bfr.readLine())!=null){
               System.out.println(line);
           }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
