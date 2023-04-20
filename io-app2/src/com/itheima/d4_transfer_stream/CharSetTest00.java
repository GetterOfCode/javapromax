package com.itheima.d4_transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class CharSetTest00 {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new FileReader("io-app2/src/csb2.txt"));
                ){
            String line;
            while ((line = br.readLine())!=null){
                System.out.println(line);


            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
