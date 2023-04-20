package com.itheima.d6_regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));
        System.out.println("z".matches("[abcd]"));

        System.out.println("a".matches("[^abc]"));
        System.out.println("z".matches("[^abc]"));


        System.out.println("ad8_".matches("\\w{1,3}"));
        System.out.println("12.25".matches("(^[1-9](\\d+)?(\\.\\d{1,2})?$)|(^\\d(\\.\\d{1,2})?$)"));
    }
}
