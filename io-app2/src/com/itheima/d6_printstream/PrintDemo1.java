package com.itheima.d6_printstream;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo1 {
    public static void main(String[] args) throws  Exception{
        //PrintStream ps = new PrintStream(new FileOutputStream("io-app2/src/ps.txt"));
        //PrintStream ps = new PrintStream("io-app2/src/pa.txt");
        PrintWriter ps = new PrintWriter("io-app2/src/ps.txt");
        ps.println(97);
        ps.println('a');
        ps.println(23.3);
        ps.println(true);
        ps.close();



    }
}
