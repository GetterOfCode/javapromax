package com.itheima.day5_integer;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //自动装箱 和自动装箱

        int a  = 10;
        Integer a1 = a;//自动装箱
        System.out.println(a1.equals(a));
        System.out.println(a1 == a);


        //Integer.parseInt()

        String number = "23";

        int age = Integer.parseInt(number);
        System.out.println(++age);


        //Double.parseDouble()
        String number1 = "11.33";
        double score = Double.parseDouble(number1);//Double.valueOf()
        System.out.println(++score);
        Double score1 = score;
        String rs = score1.toString();
        Double score2 = Double.valueOf(rs);
        System.out.println(++score2);
    }

}
