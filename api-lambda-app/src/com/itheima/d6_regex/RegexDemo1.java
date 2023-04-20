package com.itheima.d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        System.out.println(checkQQ("155111"));

        //正则表达式初体验：
        System.out.println(checkQQ2("2222"));

    }
    public static boolean checkQQ2(String qq){
        return qq != null && qq.matches("\\d{6,20}");
    }
    public static boolean checkQQ(String qq){
        //1.判断qq号码的长度是否满足要求
        if(qq == null || qq.length() < 6 || qq.length() > 20){
            return false;
        }
        //2.判断qq中是否全部是数字，不是返回false
        // 251415a87
        for (int i = 0; i < qq.length(); i++) {
            //获取每个字符
            char ch = qq.charAt(i);
            //判断这个字符是否不是数字，不是数字直接返回false
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        return true;
    }
}
