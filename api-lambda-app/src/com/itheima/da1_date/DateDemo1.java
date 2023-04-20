package com.itheima.da1_date;


import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        long rs = System.currentTimeMillis();
        long t = 0;
        for (long i = 0; i < 999999999; i++) {
            t++;
        }
        long rs1 = System.currentTimeMillis();
        double rs2 = (double)(rs1 - rs)/1000;
        System.out.println(rs2+"s");

        long time = d.getTime();
        var date = new Date(time);
        System.out.println(date);
        d.setTime(time);
        System.out.println(d.getTime());




        long time1 = System.currentTimeMillis();
        time1 += (60*60+121)*1000;
        d.setTime(time1);
        System.out.println(d);


    }
}
