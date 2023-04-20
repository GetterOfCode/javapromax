package com.itheima.d1_unchange_collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Double> lists = List.of(555.0,666.0,701.0);

        Double score = lists.get(1);
        System.out.println(score);
        System.out.println(lists);


        Set<String> sets = Set.of("lol","cf");
        for (String set : sets) {
            System.out.println(set);

        }

    }
}
