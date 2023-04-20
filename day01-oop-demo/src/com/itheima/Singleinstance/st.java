package com.itheima.Singleinstance;

import java.util.Scanner;

public class st {
    private  st(){}
    public static int add(int a,int b,int c){return a+b+c;}
    public static int add(int a,int b){return a+b;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(st.add(a,b));
        System.out.println(st.add(a,b,c));

    }
}
