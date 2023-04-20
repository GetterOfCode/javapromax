package com.itheima.d5_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        maps.put("手表",15);
        maps.put("生活用品",12);
        maps.put("洗漱用品",16);

        System.out.println(maps);


        Set<Map.Entry<String,Integer>> entries = maps.entrySet();

        System.out.println(entries);


        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println(entry);
        }
        maps.forEach(( s, integer) -> System.out.println(s+"------>"+integer));





    }
}
