package com.itheima.d5_map;

import java.util.*;
import java.util.function.Consumer;

public class mapDemo1 {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        maps.put("java", 1);
        maps.put("黑马程序员", 1);
        maps.put("java", 100);
        System.out.println(maps);


       /* maps.clear();
        System.out.println(maps);

        System.out.println(maps.isEmpty());*/

        Integer value = maps.get("java");
        System.out.println(value);
        System.out.println(maps.get("ok"));

        maps.remove("java");
        System.out.println(maps);

        System.out.println(maps.containsKey("黑马程序员"));
        System.out.println(maps.containsValue("12"));

        Set<String> sets = maps.keySet();

        System.out.println(sets);
        maps.put("ko", 52);
        maps.put("koo", 51);

        Collection<Integer> values = maps.values();
        System.out.println(values);
        values.forEach(System.out::println);
        ArrayList<Integer> lists = new ArrayList<>(values);
        Collections.sort(lists, (o1, o2) -> o1-o2);
        lists.forEach(System.out::println);
        System.out.println(values);



        Map<String,Integer> maps1 =new HashMap<>();
        maps1.put("java1",100);
        maps1.put("java2",15);
        Map<String,Integer> maps2 =new HashMap<>();
        maps2.put("java2",12);
        maps2.put("java3",17);
        maps1.putAll(maps2);
        System.out.println(maps1);

        Set<String> keysets = maps1.keySet();
        for (String keyset : keysets) {
            int v = maps1.get(keyset);
            System.out.println(v);
        }
    }

}
