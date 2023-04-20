package com.itheima.map_test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Mapoop {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap();
        maps.put("a",1);
        maps.put("b",2);
        maps.put("ab",3);
        System.out.println(maps);
        Set<Map.Entry<String,Integer>> entries = maps.entrySet();
        System.out.println(entries);
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }

        maps.forEach((s,integer)-> System.out.println(s+"---->"+integer));

    }
}
