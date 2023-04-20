package com.itheima.da1_simpledatefomat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        String rs = sdf0.format(date);
        System.out.println(rs);


        SimpleDateFormat sdf1 = new SimpleDateFormat();
        long time =date.getTime();
        System.out.println(sdf0.format(time));
        System.out.println(sdf1.format(time));
    }
}
