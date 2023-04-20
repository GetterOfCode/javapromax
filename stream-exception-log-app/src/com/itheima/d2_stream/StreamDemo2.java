package com.itheima.d2_stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();
        String[] names = {"灭绝","小昭","周芷若","赵敏"};
        Stream<String> nameStream = Arrays.stream(names);//第一种获取数组 stream流的方式
        Stream<String> nameStream2 = Stream.of(names);//第二种数组 获取stream流方
        // 式

        //List<String> s1 = nameStream.filter(m -> !m.contains("敏")).toList();

        //System.out.println(s1);
        /*String[] s2 = nameStream2.filter(m -> !m.contains("若")).toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/
        //String[] s2 = nameStream2.filter(m -> !m.contains("若")).toArray(value->new String[value]);
      /*  String[] s2 = nameStream2.filter(m -> !m.contains("若")).toArray(String[]::new);
        for (String s1 : s2) {
            System.out.println(s1);
        }
        System.out.println(s2[0]);
        List<String> lists =new ArrayList<>();
        for (String s1 : s2) {
            lists.add(s1);
        }
        lists.forEach(System.out::println);*/
        //System.out.println(Arrays.toString(s2));


        List<String> lists1 = nameStream2.filter(m -> !m.contains("若")).collect(Collectors.toList());
        System.out.println(lists1);

    }
}
