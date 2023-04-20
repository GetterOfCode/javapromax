package com.itheima.map_test;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * 需求，投票人数
 */
public class MapTest1 {
    public static void main(String[] args) {
        String[] selects = {"A","B","C","D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);

        }
        System.out.println(sb);

        //定义一个map集合记录最终统计的结果
        Map<Character, Integer> infos = new HashMap<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if(infos.containsKey(ch)){
                infos.put(ch,infos.get(ch)+1);
            }else {
                infos.put(ch,1);
            }
        }
        //new Consumer<>()
        //Comparator
        infos.forEach(((character, integer) -> System.out.println(character+"---->"+integer)));//第一种遍历方式
        System.out.println(infos);

        Set<Map.Entry<Character,Integer>> entries= infos.entrySet();
        System.out.println(entries);
        //第二种 遍历方式;
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+"---->"+entry.getValue());

        }
    }


}
