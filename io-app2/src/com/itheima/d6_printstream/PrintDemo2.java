package com.itheima.d6_printstream;

import java.io.PrintStream;

public class PrintDemo2 {
    public static void main(String[] args) throws Exception{
        System.out.println("锦瑟无端五十弦");
        System.out.println("一线一柱思华年");
        PrintStream ps = new PrintStream("io-app2/src/log.txt");
        System.setOut(ps);
        System.out.println("aaadsd" );


    }
}
