package com.itheima.da1_simpledatefomat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {

    //解析字符串时间成为日期对象
    public static void main(String[] args) throws ParseException {
        String dateStr = "2022年11月11日 11:11:11";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(dateStr);
        System.out.println(date);
        System.out.println(sdf.format(date));

    }







}



