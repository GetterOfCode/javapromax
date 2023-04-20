package com.itheima.d2_rercusion;

public class RecursionDemo01 {
    public static void main(String[] args) {
        //System.out.println(f(30));
        System.out.println(sum(1));
    }
    public static long f(long n){
        return n!=1?n*f(n-1):1;
    }
    public static long sum(long x){
        return x == 10?1:2*sum(x+1)+2;
    }
}
