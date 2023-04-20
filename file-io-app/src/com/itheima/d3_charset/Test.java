package com.itheima.d3_charset;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 自己进行文字的编码和解码
 */

public class Test {
    public static void main(String[] args) throws Exception {
        //编码
        String name = "abc我爱你中国";

        byte[] bytes = name.getBytes("utf-16");//以当前代码默认字符集编码
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        //解码
        String rs =new String(bytes,"utf-16");// 默认utf-8
        System.out.println(rs);


    }
}
