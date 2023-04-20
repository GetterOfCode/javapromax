package com.itheima.d3_char_buffer;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BufferedCharTest03 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("io-app2/src/csb.txt"));
            List<String> data = new ArrayList<>();
            String line;
            while((line = br.readLine())!=null){
                data.add(line);
            }
            System.out.println(data);
            List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes,"一","二","三","四","五","陆","柒","八","九","十","十一");
            Collections.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return sizes.indexOf(o1.substring(0,o1.indexOf(".")))
                            -sizes.indexOf(o2.substring(0,o2.indexOf(".")));
                }
            });
            BufferedWriter bw = new BufferedWriter(new FileWriter("io-app2/src/csb1.txt"));
            for (String datum : data) {
                bw.write(datum);
                bw.newLine();
            }
            bw.close();
            br.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
