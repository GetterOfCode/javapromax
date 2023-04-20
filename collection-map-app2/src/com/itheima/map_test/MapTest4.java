package com.itheima.map_test;

import java.util.*;
import java.util.function.BiConsumer;

public class MapTest4 {
    public static void main(String[] args) {
        Map<String, List<String>> data = new HashMap<>();


        //
        List<String> selects = new ArrayList<>();
        Collections.addAll(selects,"A","C");

        data.put("罗勇",selects);
        System.out.println(data);

        List<String> selects1 = new ArrayList<>();
        Collections.addAll(selects1,"C","D","B");
        data.put("胡涛",selects1);
        System.out.println(data);

        List<String> selects2 = new ArrayList<>();
        Collections.addAll(selects2,"A","C","D","B");
        data.put("刘军",selects2);
        System.out.println(data);


        Map<String,Integer> infos = new HashMap<>();
        Collection<List<String>> values = data.values();

        for (List<String> value : values) {
            for (String s : value) {
                if(infos.containsKey(s)){
                    infos.put(s,infos.get(s)+1);
                }else{
                    infos.put(s,1);
                }
            }
        }
        System.out.println(infos);
        infos.forEach((s,interger)-> System.out.println(s+"----->"+interger));



    }
}
